package DEMO;

public class BasicMusicPlayer implements MusicPlayer {
    private MusicPlayerBridge musicPlayerBridge;

    public BasicMusicPlayer(MusicPlayerBridge musicPlayerBridge) {
        this.musicPlayerBridge = musicPlayerBridge;
    }

    @Override
    public void play(String fileName) {
        musicPlayerBridge.play(fileName);
    }
}

