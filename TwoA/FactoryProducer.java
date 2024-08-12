package TwoA;


public class FactoryProducer {
	public static AbstractGame getFactory(boolean weapon) {
		if(weapon){
	         return new GameFac();         
	      }else{
	         return new PowerFactory();
	      }
}

}
