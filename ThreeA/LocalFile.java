package DEMO;

public class LocalFile implements MusicPlayer{
	
	public void playLocalFile(String fileName) {
		System.out.println("Music from Local filesName: " + fileName);
	}
	public void playOnline(String fileName) {
		//System.out.println("Music from Online stream.");
	}
	public void playRadio(String fileName) {
		//System.out.println("Music from radio.");
	}

}
