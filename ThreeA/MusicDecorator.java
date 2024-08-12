package DEMO;

public abstract class MusicDecorator implements MusicPlayer {
	protected MusicPlayer decoratedMusic;

	   public MusicDecorator(MusicPlayer decoratedMusic){
	      this.decoratedMusic = decoratedMusic;
	   }
	   public void playLocalFile(String fileName) {
		   decoratedMusic.playLocalFile(fileName);
	   } public void playOnline(String fileName) {
		   decoratedMusic.playOnline(fileName);
	   } public void playRadio(String fileName) {
		   decoratedMusic.playRadio(fileName);
	   }

}
