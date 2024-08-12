package DEMO;

public class MusicPlayerBridge {
    private MusicSource musicSource;

    public MusicPlayerBridge(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void play(String fileName) {
        musicSource.play(fileName);
    }
}

