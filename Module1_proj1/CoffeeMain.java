package Mone;

public class CoffeeMain {
	public static void main(String[] args) {
		 Coffee milk = new Milk();
		 Coffee sugar = new Sugar();

	      Coffee coldMilk = new ColdCoffeeDecorator(new Milk());

	      Coffee coldWhip = new ColdCoffeeDecorator(new Whip());
	      System.out.println("Cold Coffee!");
	      coldMilk.make();
	      sugar.make();
	      System.out.println("Cold Coffee has ");
	      
	      System.out.println("\nHot Coffee!");
	      milk.make();
	      sugar.make();

	     
	      System.out.println("\nCoffe with whip!");
	      milk.make();
	      sugar.make();
	      coldWhip.make();
	      coldMilk.make();
	      
	      
	      
	}

}



