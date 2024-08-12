package DEMO;

public class MusicPlayerMain {
    public static void main(String[] args) {
        // Using the Play class with MusicAdapter (which now uses the Bridge Pattern)
        Play player = new Play();

        player.play("online", "beyond the horizon.mp3");
        player.play("localfile", "alone.mp3");
        player.play("radio", "far far away.mp3");
        player.play("localfile", "mind me.mp3");

        // Demonstrating the use of decorators with the bridge
        MusicPlayerBridge decoratedLocalPlayer = new MusicPlayerBridge(new LocalFileSource());
        MusicPlayer decoratedWithEqualizer = new EqualizerDecorator(new BasicMusicPlayer(decoratedLocalPlayer));
        VolumeControlDecorator decoratedWithVolumeControl = new VolumeControlDecorator(decoratedWithEqualizer);
        decoratedWithVolumeControl.play("alone.mp3");
    }
}
