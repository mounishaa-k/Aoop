package sixaV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPlaylist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter singer name: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(name, artist);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter the current position of the song: ");
                    int oldPosition = scanner.nextInt();
                    System.out.print("Enter the new position of the song: ");
                    int newPosition = scanner.nextInt();
                    playlist.moveSong(oldPosition, newPosition);
                    break;
                case 4:
                    playlist.displayPlaylist();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Playlist application.");
    }
}

