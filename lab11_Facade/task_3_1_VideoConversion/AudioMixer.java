public class AudioMixer {
    public void fix(VideoFile videoFile, Buffer audioBuffer) {
        System.out.println("AudioMixer: fixing audio...");
        videoFile.setAudioBuffer(audioBuffer);
    }
}
