public class File {
    private final String fileName;
    private EncryptionStrategy encryptionStrategy;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void encrypt() {
        if (encryptionStrategy == null) {
            System.out.println("Encryption strategy is not set for " + fileName);
            return;
        }

        encryptionStrategy.encrypt(fileName);
    }
}
