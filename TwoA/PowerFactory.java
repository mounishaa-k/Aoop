package TwoA;

public class PowerFactory extends AbstractGame {

	@Override
	GameF getRelease(String releaseType) {
		if(releaseType.equalsIgnoreCase("powerupa")){
	         return new PowerupA();         
	      }else if(releaseType.equalsIgnoreCase("powerupb")){
	         return new PowerupB();
	      }	 
		return null;
	}

}
