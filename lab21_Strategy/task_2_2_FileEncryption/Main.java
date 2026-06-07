public class Main {
    public static void main(String[] args) {
        File file = new File("test.pdf");

        file.setEncryptionStrategy(new AesEncryptionStrategy());
        file.encrypt();

        file.setEncryptionStrategy(new DesEncryptionStrategy());
        file.encrypt();

        file.setEncryptionStrategy(new RsaEncryptionStrategy());
        file.encrypt();

        file.setEncryptionStrategy(new EccEncryptionStrategy());
        file.encrypt();
    }
}
