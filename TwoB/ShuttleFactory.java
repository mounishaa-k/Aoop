package Twob;

public class ShuttleFactory extends TransportModeFactory {
    public TransportMode createTransportMode() {
        return new Shuttle();
    }
}
