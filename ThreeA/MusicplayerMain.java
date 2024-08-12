package DEMO;

public class MusicplayerMain {
    public static void main(String[] args) {
        MusicPlayer localPlayer = new LocalFile();
        MusicPlayer onlinePlayer = new Online();
        MusicPlayer radioPlayer = new Radio();

        // Adding Equalizer and Volume Control to Local Player
        MusicPlayer decoratedLocalPlayer = new VolumeControlDecorator(new EqualizerDecorator(localPlayer));
        decoratedLocalPlayer.playLocalFile("alone.mp3");

        // Adding Equalizer to Online Player
        MusicPlayer decoratedOnlinePlayer = new EqualizerDecorator(onlinePlayer);
        decoratedOnlinePlayer.playOnline("beyond the horizon.mp3");

        // Adding Volume Control to Radio Player
        MusicPlayer decoratedRadioPlayer = new VolumeControlDecorator(radioPlayer);
        decoratedRadioPlayer.playRadio("far far away.mp3");
    }
}

