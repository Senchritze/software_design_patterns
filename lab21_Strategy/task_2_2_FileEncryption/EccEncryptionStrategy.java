public class EccEncryptionStrategy implements EncryptionStrategy {
  @Override
  public void encrypt(String fileName) {
    System.out.println("Applying ECC encryption to " + fileName);
  }
}
