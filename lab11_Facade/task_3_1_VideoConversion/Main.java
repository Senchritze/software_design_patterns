public class Main {
    public static void main(String[] args) {
        String fileName = "youtubevideo.ogg";
        VideoFile videoFile = new VideoFile(fileName,
                new Buffer("Byte buffer of video"),
                new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec());

        VideoConversionFacade converter = new VideoConversionFacade();
        VideoFile convertedVideo = converter.convert(videoFile, new MPEG4CompressionCodec());

        convertedVideo.play(new MPEG4CompressionCodec());
    }
}
