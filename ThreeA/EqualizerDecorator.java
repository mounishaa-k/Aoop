package DEMO;


public class EqualizerDecorator extends MusicDecorator {

    public EqualizerDecorator(MusicPlayer decoratedMusic) {
        super(decoratedMusic);
    }

    @Override
    public void playLocalFile(String fileName) {
        super.playLocalFile(fileName);
        setEqualizer();
    }

    @Override
    public void playOnline(String fileName) {
        super.playOnline(fileName);
        setEqualizer();
    }

    @Override
    public void playRadio(String fileName) {
        super.playRadio(fileName);
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}

