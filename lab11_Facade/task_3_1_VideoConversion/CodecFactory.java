public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if ("mp4".equalsIgnoreCase(type)) {
            return new MPEG4CompressionCodec();
        }
        return new OggCompressionCodec();
    }
}
