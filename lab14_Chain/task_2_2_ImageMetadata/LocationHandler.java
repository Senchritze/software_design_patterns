import java.util.Random;

public class LocationHandler extends ImageAttributeHandler {
    private static final String[] LOCATIONS = {
            "Kyiv",
            "Lviv",
            "Odesa",
            "Dnipro",
            "Kharkiv"
    };

    private final Random random = new Random();

    @Override
    protected void process(Image image) {
      if (image.getLocation() == null || image.getLocation().isBlank()) {
            image.setLocation(LOCATIONS[random.nextInt(LOCATIONS.length)]);
        }
    }
}
