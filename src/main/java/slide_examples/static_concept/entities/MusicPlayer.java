package slide_examples.static_concept.entities;

import java.util.ArrayList;

public class MusicPlayer {
    private static int count = 0;

    private String owner;
    private int playerId;
    private ArrayList<String> songs;

    public MusicPlayer(String owner, ArrayList<String> songs){
        if (owner == null) {
            owner = "Anonymous";
        }
        if (songs == null) {
            songs = new ArrayList<>();
        }

        MusicPlayer.count++;

        this.playerId = MusicPlayer.count;
        this.owner = owner;
        this.songs = songs;
    }

    public void display(){
        System.out.println("MusicPlayer[Count=" + MusicPlayer.count + ", id=" + this.playerId
                + ", owner=" + this.owner + ", library: " + this.songs);
    }
}
