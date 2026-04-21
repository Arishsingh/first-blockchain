# First Blockchain Implementation


## 📌 Project Overview

The project models a linked chain of cryptographically secured blocks. [cite_start]Each block contains a data payload, its own SHA-256 hash, and the hash of the preceding block, ensuring immutability[cite: 31]. [cite_start]The system also implements a Proof-of-Work (PoW) mining mechanism to model consensus[cite: 32].

### Key Features
* [cite_start]**SHA-256 Hashing:** Generates unique digital fingerprints for every block to ensure data integrity[cite: 49, 116].
* [cite_start]**Proof-of-Work (Mining):** Implements a computational challenge where a valid hash must start with a configurable number of leading zeros[cite: 32, 120].
* [cite_start]**Chain Validation:** An algorithm that verifies the integrity of the entire chain by checking block hashes and their linkages[cite: 34, 114].
* [cite_start]**Tamper Detection:** Demonstrates how changing data in any block invalidates the entire subsequent chain[cite: 67, 140].

## 💻 OS Concepts Demonstrated

[cite_start]This project serves as a practical application of several Operating Systems topics[cite: 73, 149]:
* [cite_start]**CPU Scheduling:** The mining loop models a CPU-bound process that performs intensive computation[cite: 74, 149].
* [cite_start]**Memory Management:** The blockchain is stored in the Java heap using dynamic allocation via `ArrayList<Block>`[cite: 74, 149].
* [cite_start]**Synchronization:** Sequential block mining ensures one process must finish before the next begins[cite: 74, 150].
* [cite_start]**Data Integrity:** SHA-256 hashes act as block-level checksums, similar to OS file system integrity checks[cite: 74, 150].
* [cite_start]**System Clock:** Uses `System.currentTimeMillis()` to demonstrate OS time management[cite: 74, 150].

## 🛠️ System Requirements

### Hardware
* [cite_start]**Processor:** Intel Core i3 or equivalent (minimum)[cite: 78].
* [cite_start]**RAM:** 4 GB (8 GB recommended)[cite: 78].

### Software
* [cite_start]**JDK:** Version 8 or higher (JDK 17 LTS recommended)[cite: 81].
* [cite_start]**IDE:** IntelliJ IDEA, Eclipse, or VS Code[cite: 81].
* [cite_start]**Library:** Google GSON (for JSON serialization)[cite: 81].

## 📂 Project Structure

[cite_start]The implementation consists of four primary Java classes[cite: 30, 86, 92]:
1.  [cite_start]**`Block.java`**: Defines the block structure, hash calculation, and mining logic[cite: 92, 96].
2.  [cite_start]**`StringUtil.java`**: Utility class for SHA-256 hashing and JSON formatting[cite: 92, 103].
3.  [cite_start]**`chain.java`**: Manages the `ArrayList` of blocks and the validation logic[cite: 92, 113].
4.  [cite_start]**`NoobChain.java`**: The main entry point that triggers mining and prints the final chain[cite: 92, 109].

## 🚀 Usage

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Arishsingh/first-blockchain](https://github.com/Arishsingh/first-blockchain)
    ```
2.  **Set Difficulty:** In `NoobChain.java`, adjust the `difficulty` variable. A difficulty of `5` requires roughly 1 million attempts per block[cite: 110, 112].
3.  **Run the Application:** Execute the `main` method in `NoobChain.java`.
4.  **View Output:** The console will display mining progress and a JSON representation of the validated chain[cite: 139, 146].


