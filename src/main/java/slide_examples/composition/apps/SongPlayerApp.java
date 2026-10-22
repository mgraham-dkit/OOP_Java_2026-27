package slide_examples.composition.apps;

import slide_examples.composition.entities.MusicPlayer;
import slide_examples.composition.entities.Song;

import java.util.ArrayList;

public class SongPlayerApp {
    static void main(String[] args) {
        ArrayList<Song> songLibrary = new ArrayList<>();
        Song song1 = new Song("Style", "Taylor Swift");
        Song song2 = new Song("We Own the Night", "Willa");
        Song song3 = new Song("Perfect Princess", "Red, Chloe, Pink");
        songLibrary.add(song1);
        songLibrary.add(song2);
        songLibrary.add(song3);

        MusicPlayer myZune = new MusicPlayer("Michelle Graham", songLibrary);
        myZune.display();

        MusicPlayer backupZune = new MusicPlayer("Alyson Bechdel", null);
        backupZune.add(song3);
        backupZune.display();
        myZune.display();
    }
}
