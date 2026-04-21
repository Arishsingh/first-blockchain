import java.util.ArrayList;

public class NoobChain {

    public static ArrayList<Block> blockchain =
            new ArrayList<Block>();

    public static int difficulty = 5;// the final hash must have 5 zeros at the start

    public static void main(String[] args) {

        // Create Genesis Block
        blockchain.add(
                new Block("Hi I'm the first block", "0")
        );

        System.out.println("Mining Genesis block...");
        blockchain.get(0).mineBlock(difficulty);

        // Block 2
        blockchain.add(
                new Block("Yo I'm the second block",
                        blockchain.get(0).hash)
        );

        System.out.println("Mining block 2...");
        blockchain.get(1).mineBlock(difficulty);

        // Block 3
        blockchain.add(
                new Block("Hey I'm the third block",
                        blockchain.get(1).hash)
        );

        System.out.println("Mining block 3...");
        blockchain.get(2).mineBlock(difficulty);

        // Check validity
        System.out.println("\nBlockchain Valid: "
                + isChainValid());
    }

    // Validate Blockchain
    public static Boolean isChainValid() {

        Block currentBlock;
        Block previousBlock;

        String hashTarget =
                new String(new char[difficulty])
                        .replace('\0', '0');

        for (int i = 1; i < blockchain.size(); i++) {

            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            // Compare stored hash
            if (!currentBlock.hash
                    .equals(currentBlock.calculateHash())) {

                System.out.println(
                        "Current Hashes not equal"
                );

                return false;
            }

            // Compare previous hash
            if (!previousBlock.hash
                    .equals(currentBlock.previousHash)) {

                System.out.println(
                        "Previous Hashes not equal"
                );

                return false;
            }

            // Check mining solved
            if (!currentBlock.hash
                    .substring(0, difficulty)
                    .equals(hashTarget)) {

                System.out.println(
                        "This block hasn't been mined"
                );

                return false;
            }
        }

        return true;
    }
}