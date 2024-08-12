package DEMO;
public class MusicAdapter implements AdvancedMusicPlayer{
	MusicPlayer musicPlayer;
	public MusicAdapter(String audioType)
	   {
	   
	      if(audioType.equalsIgnoreCase("localfile") )
	      {
	         musicPlayer = new LocalFile();			
	         
	      }
	      else if (audioType.equalsIgnoreCase("radio"))
	      {
	         musicPlayer = new Radio();
	      }	else {
	    	  musicPlayer = new Online(); 
	      }
	   }
	public void play(String audioType, String fileName)
	   {
	   
	      if(audioType.equalsIgnoreCase("localfile"))
	      {
	         musicPlayer.playLocalFile(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("radio"))
	      {
	         musicPlayer.playRadio(fileName);
	      }else {
	    	  musicPlayer.playOnline(fileName);

	      }

}
}
