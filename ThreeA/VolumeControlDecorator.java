package DEMO;

public class VolumeControlDecorator extends MusicDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedMusic) {
        super(decoratedMusic);
    }

    @Override
    public void playLocalFile(String fileName) {
        super.playLocalFile(fileName);
        setVolume();
    }

    @Override
    public void playOnline(String fileName) {
        super.playOnline(fileName);
        setVolume();
    }

    @Override
    public void playRadio(String fileName) {
        super.playRadio(fileName);
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume adjusted to preferred level.");
    }
}
