import java.util.Random;

public class Client {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ImageAttributeHandler chain = buildChain();

        for (int i = 0; i <= 10; ++i) {
            Image image = new Image();
            chain.handle(image);

            System.out.println("Image created: " + image);

            try {
                Thread.sleep(1000 + RANDOM.nextInt(1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static ImageAttributeHandler buildChain() {
      ImageAttributeHandler camera = new CameraHandler("Samsung Galaxy S23 Ultra");
      ImageAttributeHandler dateTime = new CreationDateTimeHandler();
      ImageAttributeHandler location = new LocationHandler();
      ImageAttributeHandler type = new TypeHandler(Image.Type.jpg);
      ImageAttributeHandler nameHandler = new NameHandler();

      camera
              .linkWith(dateTime)
              .linkWith(location)
              .linkWith(type)
              .linkWith(nameHandler);

      return camera;
    }
}
