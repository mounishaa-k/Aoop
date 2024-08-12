package TwoA;

public class GameSingleton {
	private static GameSingleton instance =null;
	 private GameSingleton() {}
	 public static GameSingleton getInstance() {
		 if(instance==null) {
			 instance=new GameSingleton();
		 }
		 return instance;
	 }
	 public void show () {
		 System.out.println("Sucessfully logged in. Start the game!");
	 }
}
