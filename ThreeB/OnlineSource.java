package DEMO;

public class OnlineSource implements MusicSource {
    @Override
    public void play(String fileName) {
        System.out.println("Playing from Online stream. Name: " + fileName);
    }
}
