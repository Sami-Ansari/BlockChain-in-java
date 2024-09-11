package Cryptocurrency;

import BlockChain.BlockChain;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Wallet {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    public Wallet(){
        KeyPair keyPair = CryptographyHelper.ellipticCurveCrypto();
        this.privateKey = keyPair.getPrivate();
        this.publicKey = keyPair.getPublic();
    }
    public double calculateBalance() {
        double balance = 0;
        for (Map.Entry<String, TransactionOutput> item: BlockChain.UTXOs.entrySet()){
            TransactionOutput transactionOutput = item.getValue();
            if (transactionOutput.isMine(publicKey)){
                balance += transactionOutput.getAmount();
            }
        }
        return balance;
    }
    public Transactions transferMoney(PublicKey receiver, double amount){
        if (calculateBalance() < amount){
            System.out.println("Invalid transaction because of not enough money...");
            return null;
        }
//        We store the input for the transaction in this array
        List<TransactionInput> inputs = new ArrayList<TransactionInput>();

//        let's find our unspent transactions (the blockchain stores all the UTXOs)
        for (Map.Entry<String , TransactionOutput> item : BlockChain.UTXOs.entrySet()){
            TransactionOutput UTXO = item.getValue();

            if (UTXO.isMine(this.publicKey)){
                inputs.add(new TransactionInput(UTXO.getId()));
            }
        }
//        let's create the new transaction
        Transactions newTransaction = new Transactions(publicKey, receiver, amount, inputs);
//        the sender signs the transactions
        newTransaction.generateSignature(privateKey);

        return newTransaction;
    }
    public PublicKey getPublicKey(){

        return publicKey;
    }
    public PrivateKey getPrivateKey(){
        return privateKey;
    }

}
