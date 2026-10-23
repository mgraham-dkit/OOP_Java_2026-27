package slide_examples.c_static_concept.apps;

import slide_examples.c_static_concept.entities.MusicPlayer;

import java.util.ArrayList;

public class PearMusic {
    static void main(String[] args) {
        ArrayList<String> songLibrary = new ArrayList<>();
        songLibrary.add("Style");
        songLibrary.add("We Own the Night");
        songLibrary.add("Perfect Princess");
        MusicPlayer myZune = new MusicPlayer("Michelle Graham", songLibrary);
        myZune.display();

        MusicPlayer backupZune = new MusicPlayer("Alyson Bechdel", null);
        backupZune.display();
        myZune.display();
    }
}
