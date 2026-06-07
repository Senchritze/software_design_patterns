public class AesEncryptionStrategy implements EncryptionStrategy {
    @Override public void encrypt(String fileName) {
        System.out.println("Applying AES encryption to " + fileName);
    }
}
