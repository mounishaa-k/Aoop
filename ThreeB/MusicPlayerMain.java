package DEMO;

public class MusicPlayerMain {
    public static void main(String[] args) {
       
        Play player = new Play();

        player.play("online", "beyond the horizon.mp3");
        player.play("localfile", "alone.mp3");
        player.play("radio", "far far away.mp3");
        player.play("localfile", "mind me.mp3");

        MusicPlayerBridge decoratedLocalPlayer = new MusicPlayerBridge(new LocalFileSource());
        MusicPlayer decoratedWithEqualizer = new EqualizerDecorator(new BasicMusicPlayer(decoratedLocalPlayer));
        VolumeControlDecorator decoratedWithVolumeControl = new VolumeControlDecorator(decoratedWithEqualizer);
        decoratedWithVolumeControl.play("alone.mp3");
    }
}
