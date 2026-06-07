public class RsaEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encrypt(String fileName) {
        String message = "Applying RSA encryption to " + fileName;
        System.out.println(message);
    }
}
