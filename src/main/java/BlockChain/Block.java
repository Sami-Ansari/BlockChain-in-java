package BlockChain;

import Cryptocurrency.CryptographyHelper;
import Cryptocurrency.Transactions;
import constants.Constants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Block {
    private int id;
    private int nonce;
    private long timeStamp;
    private String hash;
    private String previousHash;
    private List<Transactions> transactions;

    public Block(String previousHash){
        this.transactions = new ArrayList<Transactions>();
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        generateHash();
    }
    public void generateHash(){
        String dataHash = Integer.toString(id)+previousHash+Long.toString(timeStamp)+transactions.toString()+Integer.toString(nonce);
        String hashValue = CryptographyHelper.generateHash(dataHash);
        this.hash = hashValue;
    }
    public void incrementNonce(){
        this.nonce++;
    }
    public String getHash(){
        return this.hash;
    }

    //    check if the given transaction is valid or not
    public boolean addTransaction(Transactions transaction){

        if (transaction == null) return false;

//        if the block is the genesis block we do not process
        if ((!previousHash.equals(Constants.GENESIS_PREV_HASH))){
            if ((!transaction.verifyTransaction())){
                System.out.println("Transactions is not valid...");
                return false;
            }
        }
        transactions.add(transaction);
        System.out.println("Transactions is valid and it's added to the block "+ this );
        return true;
    }
}


