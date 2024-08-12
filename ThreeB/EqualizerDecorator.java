package DEMO;

public class EqualizerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    @Override
    public void play(String fileName) {
        decoratedMusicPlayer.play(fileName);
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}

