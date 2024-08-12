package DEMO;

public class RadioSource implements MusicSource {
    @Override
    public void play(String fileName) {
        System.out.println("Playing from Radio. Name: " + fileName);
    }
}
