package DEMO;

public class MusicAdapter implements AdvancedMusicPlayer {
    MusicPlayerBridge musicPlayerBridge;

    public MusicAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("localfile")) {
            musicPlayerBridge = new MusicPlayerBridge(new LocalFileSource());
        } else if (audioType.equalsIgnoreCase("radio")) {
            musicPlayerBridge = new MusicPlayerBridge(new RadioSource());
        } else {
            musicPlayerBridge = new MusicPlayerBridge(new OnlineSource());
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        musicPlayerBridge.play(fileName);
    }
}
