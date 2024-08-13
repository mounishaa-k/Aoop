package DEMO;


public class Play implements AdvancedMusicPlayer {
	MusicAdapter musicAdapter;

	public void play(String audioType, String fileName) 
	{

	      if(audioType.equalsIgnoreCase("localfile"))
	      {
	         System.out.println("Playing Local file. Name: " + fileName);			
	      } 
	      
	     
	      else if(audioType.equalsIgnoreCase("radio") || audioType.equalsIgnoreCase("Online"))
	      {
	         musicAdapter = new MusicAdapter(audioType);
	         musicAdapter.play(audioType, fileName);
	      }
	      
	      else
	      {
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }

}
}
