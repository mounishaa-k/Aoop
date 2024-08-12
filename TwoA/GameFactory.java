package TwoA;

public class GameFactory {
public Game getLevel(String level) {
	 if(level == null){
         return null;
      }		
      if(level.equalsIgnoreCase("level1")){
         return new Level1game();
         
      } else if(level.equalsIgnoreCase("level2")){
         return new Level2game();
         
      } else if(level.equalsIgnoreCase("level3")){
         return new Level3game();
      }
      
      return null;
}
}
