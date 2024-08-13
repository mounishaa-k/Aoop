package DEMO;

public class MusicplayerMain {
    public static void main(String[] args) {
        MusicPlayer localPlayer = new LocalFile();
        MusicPlayer onlinePlayer = new Online();
        MusicPlayer radioPlayer = new Radio();

        MusicPlayer decoratedLocalPlayer = new VolumeControlDecorator(new EqualizerDecorator(localPlayer));
        decoratedLocalPlayer.playLocalFile("alone.mp3");

  
        MusicPlayer decoratedOnlinePlayer = new EqualizerDecorator(onlinePlayer);
        decoratedOnlinePlayer.playOnline("beyond the horizon.mp3");

        MusicPlayer decoratedRadioPlayer = new VolumeControlDecorator(radioPlayer);
        decoratedRadioPlayer.playRadio("far far away.mp3");
    }
}

