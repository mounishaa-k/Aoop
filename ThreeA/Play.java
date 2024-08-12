package DEMO;


public class Play implements AdvancedMusicPlayer {
	MusicAdapter musicAdapter;

	public void play(String audioType, String fileName) 
	{
		//inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("localfile"))
	      {
	         System.out.println("Playing Local file. Name: " + fileName);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
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
