package Twob;

public class BikeFactory extends TransportModeFactory {
    public TransportMode createTransportMode() {
        return new Bike();
    }
}

