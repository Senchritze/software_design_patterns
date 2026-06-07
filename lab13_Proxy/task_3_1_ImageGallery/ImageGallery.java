public class ImageGallery {
    public static void main(String[] args) {
        String path = "lab13_Proxy/task_3_1/resources/";

        DisplayObject[] images = {
                new ImageProxy(path + "image1.jpeg"),
                new ImageProxy(path + "image2.jpeg"),
                new ImageProxy(path + "image3.jpeg"),
                new ImageProxy(path + "image4.jpeg"),
                new ImageProxy(path + "image5.jpeg"),
                new ImageProxy(path + "image6.jpeg"),
                new ImageProxy(path + "image7.jpeg"),
                new ImageProxy(path + "image8.jpeg"),
                new ImageProxy(path + "image9.jpeg"),
                new ImageProxy(path + "image10.jpeg")
        };

        System.out.println("Gallery created.");
        System.out.println("Images are not loaded yet.");
        System.out.println("Each image will be loaded only before display().");

        for (int i = 0; i < images.length; i++) {
            System.out.println("Showing image #" + (i + 1));
            images[i].display();
        }
    }
}
