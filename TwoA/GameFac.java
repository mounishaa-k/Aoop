package TwoA;


public class GameFac extends AbstractGame{

	@Override
	GameF getRelease(String releaseType) {
		if(releaseType.equalsIgnoreCase("Weapon1")){
	         return new weapon1();         
	      }else if(releaseType.equalsIgnoreCase("weapon2")){
	         return new Weapon2();
	      }	 
		return null;
	}
	

}
