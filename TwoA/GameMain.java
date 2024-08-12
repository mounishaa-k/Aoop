package TwoA;

public class GameMain {
	public static void main(String[] args) {
		GameSingleton obj = GameSingleton.getInstance();
		obj.show();
		GameFactory gameFactory = new GameFactory();
	      //get an object of level1 and call its createEnime method.
	      Game game1 = gameFactory.getLevel("level1");

	      //call createEnime method of level1
	      game1.createEnime();

	    //get an object of level2 and call its createEnime method.
	      Game game2 = gameFactory.getLevel("level2");
	      game2.createEnime();
	    //call createEnime method of level1
	      
	    //get an object of level3 and call its createEnime method.
	      Game game3 = gameFactory.getLevel("level3");
	      game3.createEnime();
	    //call createEnime method of level1
	     
	      /*AbstractGame GameFac = FactoryProducer.getFactory(false);
	      //get an object of Shape Rectangle
	      GameF release1 = GameFac.getRelease("powerupA");
	      //call draw method of Shape Rectangle
	      release1.release();
	      //get an object of Shape Square 
	      GameF release2 = GameFac.getRelease("powerupB");
	      //call draw method of Shape Square
	      release2.release();
	      //get shape factory
	      AbstractGame GameFac1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	      GameF release3 = GameFac1.getRelease("weapon1");
	      //call draw method of Shape Rectangle
	      release3.release();
	      //get an object of Shape Square 
	      GameF release4 = GameFac1.getRelease("weapon2");
	      //call draw method of Shape Square
	      release4.release();*/
	}
}
