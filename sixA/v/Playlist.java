package sixaV;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    public void addSong(String name, String singer) {
        songs.add(new Song(name, singer));
    }

    public void removeSong(String name) {
        boolean removed = false;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equalsIgnoreCase(name)) {
                songs.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Song not found: " + name);
        }
    }

    public void moveSong(int oldPosition, int newPosition) {
        if (oldPosition >= 1 && oldPosition <= songs.size() &&
            newPosition >= 1 && newPosition <= songs.size()) {
            Song song = songs.remove(oldPosition - 1);
            songs.add(newPosition - 1, song);
        } else {
            System.out.println("Invalid positions.");
        }
    }
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }
}

