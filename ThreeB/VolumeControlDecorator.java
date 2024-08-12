package DEMO;

public class VolumeControlDecorator implements MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    @Override
    public void play(String fileName) {
        decoratedMusicPlayer.play(fileName);
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Volume adjusted to preferred level.");
    }
}

