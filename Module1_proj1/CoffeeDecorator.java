package Mone;


public abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;

	   public CoffeeDecorator(Coffee decoratedCoffee){
	      this.decoratedCoffee = decoratedCoffee;
	   }
	@Override
	public void make() {
		decoratedCoffee.make();
	}

}
