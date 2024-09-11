package constants;

public class Constants {

    private Constants(){

    }
    //    this is the numbers of leading zero
    public static final int DIFFICULTY = 5;
    // This is the hash (SHA-256) of the previous hash of the first block
    public static final String GENESIS_PREV_HASH = "000000000000000000000000000000000000000000000000000000000000000";
    //    amount of BTC the miners get after the mining
    public static final double MINER_REWARD = 6.25;
}
