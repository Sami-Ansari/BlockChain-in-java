package Application;

import BlockChain.BlockChain;
import BlockChain.Block;
import Cryptocurrency.Miner;
import Cryptocurrency.Transactions;
import Cryptocurrency.Wallet;
import Cryptocurrency.TransactionOutput;
import constants.Constants;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //the security provider is Bouncy Castle: more flexible than JCE
        Security.addProvider(new BouncyCastleProvider());

        //create wallets + blockchain + the single miner in the network
        Wallet userA = new Wallet();
        Wallet userB = new Wallet();
        Wallet lender = new Wallet();
        BlockChain chain = new BlockChain();
        Miner miner = new Miner();
        int amount = 0;
        //create genesis transaction that sends 500 coins to userA:
        Transactions genesisTransaction = new Transactions(lender.getPublicKey(), userA.getPublicKey(), 500, null);
        genesisTransaction.generateSignature(lender.getPrivateKey());
        genesisTransaction.setTransactionId("0");
        genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.getReceiver(), genesisTransaction.getAmount(), genesisTransaction.getTransactionId()));
        BlockChain.UTXOs.put(genesisTransaction.outputs.get(0).getId(), genesisTransaction.outputs.get(0));

        System.out.println("Constructing the genesis block...");
        Block genesis = new Block(Constants.GENESIS_PREV_HASH);
        genesis.addTransaction(genesisTransaction);
        miner.mine(genesis,chain);
        Block block1 = new Block(genesis.getHash());
        System.out.println("\nuserA's balance is: " + userA.calculateBalance());
        int i = 1;

        Scanner sc = new Scanner(System.in);


        while (i == 1){
            System.out.println("Enter the amount");
            amount = sc.nextInt();
            System.out.println("Enter the address of the receiver ");
            String st = sc.next();
            System.out.println("\n1Gx9FCknxSsLfFDzFdn75Xgqx95sDp38ir tries to send money ("+ amount +" coins) to "+st);
            block1.addTransaction(userA.transferMoney(userB.getPublicKey(), amount));
            System.out.println("\n 1Gx9FCknxSsLfFDzFdn75Xgqx95sDp38ir balance is: " + userA.calculateBalance());
            System.out.println(  "balance is: " + userB.calculateBalance());
            System.out.println("Add transactions press one and or to mine block press any");
            i = sc.nextInt();
        }
        miner.mine(block1,chain);

        System.out.println("Enter the amount");
//        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        System.out.printf("\nuserA tries to send money (%d coins) to userB...\n",amount);
        block1.addTransaction(userB.transferMoney(userA.getPublicKey(), amount));
        miner.mine(block1,chain);
        System.out.println("\nuserA's balance is: " + userA.calculateBalance());
        System.out.println("userB's balance is: " + userB.calculateBalance());

        Block block2 = new Block(block1.getHash());
        System.out.println("Enter the amount");
        amount = sc.nextInt();
        System.out.printf("\nuserA sends more funds (%d) than it has...\n",amount);
        block2.addTransaction(userA.transferMoney(userB.getPublicKey(),amount));
        miner.mine(block2,chain);
        System.out.println("\nuserA's balance is: " + userA.calculateBalance());
        System.out.println("userB's balance is: " + userB.calculateBalance());


        Block block3 = new Block(block2.getHash());
        System.out.println("Enter the amount");
        amount = sc.nextInt();
        System.out.printf("\nuserB is attempting to send funds (%d) to userA...\n",amount);
        block3.addTransaction(userB.transferMoney( userA.getPublicKey(), amount));
        System.out.println("\nuserA's balance is: " + userA.calculateBalance());
        System.out.println("userB's balance is: " + userB.calculateBalance());
        miner.mine(block3,chain);
        System.out.println("Miner's reward: "+miner.getReward());
    }
}

