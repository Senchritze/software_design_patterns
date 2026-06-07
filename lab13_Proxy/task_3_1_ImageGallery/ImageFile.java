import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageFile implements DisplayObject {
    private final String path;
    private final BufferedImage image;

    public ImageFile(String path) {
        this.path = path;
        image = load(path);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + path);
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label, "Image Viewer", JOptionPane.PLAIN_MESSAGE);
    }

    BufferedImage load(String path) {
        System.out.println("Loading image " + path + "...");
        File file = new File(path);

        if (file.exists()) {
            try {
                BufferedImage loadedImage = ImageIO.read(file);
                if (loadedImage != null) {
                    return loadedImage;
                }
            } catch (IOException e) {
                System.out.println("Cannot load image from file: " + path);
            }
        } else {
            System.out.println("Image file not found: " + path);
        }

        System.out.println("Using placeholder image for: " + path);
        return createPlaceholderImage(path);
    }

    private BufferedImage createPlaceholderImage(String path) {
        BufferedImage placeholder = new BufferedImage(600, 220, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = placeholder.createGraphics();

        graphics.setColor(new Color(245, 245, 245));
        graphics.fillRect(0, 0, 600, 220);

        graphics.setColor(new Color(180, 0, 0));
        graphics.drawRect(10, 10, 579, 199);

        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Arial", Font.BOLD, 22));
        graphics.drawString("Image could not be loaded", 30, 70);

        graphics.setFont(new Font("Arial", Font.PLAIN, 16));
        graphics.drawString("Path: " + path, 30, 110);
        graphics.drawString("Add a real image file to the resources folder to display it.", 30, 145);
        graphics.drawString("This placeholder is shown to keep the demo runnable.", 30, 175);

        graphics.dispose();
        return placeholder;
    }
}
