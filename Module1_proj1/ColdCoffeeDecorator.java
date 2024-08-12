package Mone;

public class ColdCoffeeDecorator extends CoffeeDecorator{
	public ColdCoffeeDecorator(Coffee decoratedCoffee) {
	      super(decoratedCoffee);		
	   }

	   @Override
	   public void make() {
	      decoratedCoffee.make();	       
	      mode(decoratedCoffee);
	   }

	   private void mode(Coffee decoratedCoffee){
	      System.out.println("Mode: Cold.");
	   }
	

}
