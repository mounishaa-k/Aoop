package DEMO;

public class Online implements MusicPlayer {
	public void playLocalFile(String fileName) {
		//System.out.println("Music from Local files.");
	}
	public void playOnline(String fileName) {
		System.out.println("Music from Online stream.Name: " + fileName);
	}
	public void playRadio(String fileName) {
		//System.out.println("Music from radio.");
	}

}
