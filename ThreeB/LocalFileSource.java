package DEMO;

public class LocalFileSource implements MusicSource {
    @Override
    public void play(String fileName) {
        System.out.println("Playing from Local file. Name: " + fileName);
    }
}
