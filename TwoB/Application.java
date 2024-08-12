package Twob;

public class Application {
	public static void main(String[] args) {

        TransportModeFactory shuttleFactory = new ShuttleFactory();
        TransportMode shuttle = shuttleFactory.createTransportMode();
        shuttle.begin();

        TransportModeFactory bikeFactory = new BikeFactory();
        TransportMode bike = bikeFactory.createTransportMode();
        bike.begin();

        PaymentMethodFactory payPalFactory = new PayPalFactory();
        PaymentMethod payPalPayment = payPalFactory.createPaymentMethod();
        payPalPayment.handlePayment(100.0);

        AuthManager authManager = AuthManager.getInstance();
        authManager.initiateSession("bob_jones", "myPassword");
        authManager.getLoggedInUser();

        
	}

}
