package slide_examples.composition.entities;

public class Song {
    private static int count = 0;

    private int songId;
    private String title;
    private String artist;

    public Song(String title, String artist){
        Song.count++;
        this.songId = count;

        this.title = title;
        this.artist = artist;
    }

    public static int getCount() {
        return count;
    }

    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String toString(){
        return "Song{songId=" + this.songId + ", title=" + title + ", artist=" + artist + "}";
    }
}
