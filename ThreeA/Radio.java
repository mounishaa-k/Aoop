package DEMO;

public class Radio implements MusicPlayer{
	public void playLocalFile(String fileName) {
		//System.out.println("Music from Local files.");
	}
	public void playOnline(String fileName){
		//System.out.println("Music from Online stream.");
	}
	public void playRadio(String fileName) {
		System.out.println("Music from radio. Name: " + fileName);
	}

}
