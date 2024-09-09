package sixaV;

public class Song {
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return name + " by " + singer;
    }
}

