public class VideoFile {
    private final String name;
    private final String codecType;
    private final Buffer videoBuffer;
    private Buffer audioBuffer;

    public VideoFile(String name, Buffer videoBuffer, Buffer audioBuffer) {
        if (!name.contains(".")) {
            throw new RuntimeException("File format is undefined!");
        }

        this.name = name.substring(0, name.lastIndexOf('.'));
        this.codecType = name.substring(name.lastIndexOf('.') + 1).toLowerCase();
        this.videoBuffer = videoBuffer;
        this.audioBuffer = audioBuffer;
    }

    public VideoFile(String name, Buffer videoBuffer) {
        this(name, videoBuffer, null);
    }

    public String getCodecType() {
        return codecType;
    }

    public Buffer getVideoBuffer(Codec codec) {
        if (codec.type().equalsIgnoreCase(codecType)) {
            return videoBuffer;
        }
        return null;
    }

    public void setAudioBuffer(Buffer audioBuffer) {
        this.audioBuffer = audioBuffer;
    }

    public Buffer getAudioBuffer() {
        return audioBuffer;
    }

    public String getName() {
        return name;
    }

    public void play(Codec codec) {
        if (codec.type().equalsIgnoreCase(codecType)) {
            System.out.println("Video data: " + videoBuffer.getData());
            if (audioBuffer == null) {
                System.out.println("Audio data is inaccessible!");
                return;
            }
            System.out.println("Audio data: " + audioBuffer.getData());
        } else {
            System.out.printf("Failed to play file '%s'! Codec '%s' required! Use correct codec!%n", name, codecType);
        }
    }
}
