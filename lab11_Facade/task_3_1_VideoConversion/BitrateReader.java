public class BitrateReader {
    public static Buffer read(VideoFile file, Codec codec) {
        System.out.println("Codec of file: " + codec.type());
        System.out.println("BitrateReader: reading file...");
        System.out.println("BitrateReader: decode video...");
        return file.getVideoBuffer(codec);
    }

    public static VideoFile convert(Buffer buffer, String name, Codec codec) {
        System.out.printf("Conversion file to format '%s'%n", codec.type());
        System.out.println("BitrateReader: encode video...");
        System.out.println("BitrateReader: writing file...");
        String newName = name + "." + codec.type();
        return new VideoFile(newName, buffer);
    }
}
