package slide_examples.composition.entities;

import java.util.ArrayList;

public class MusicPlayer {
    private static int playerCount;

    private int playerId;
    private String owner;
    private ArrayList<Song> library;

    public MusicPlayer(String owner){
        MusicPlayer.playerCount++;
        this.playerId = MusicPlayer.playerCount;

        this.owner = owner;
        this.library = new ArrayList<>();
    }

    public MusicPlayer(String owner, ArrayList<Song> library){
        MusicPlayer.playerCount++;
        this.playerId = MusicPlayer.playerCount;

        this.owner = owner;

        if(library == null){
            library = new ArrayList<>();
        }
        this.library = library;
    }

    public boolean containsSong(Song target){
        if(target == null){
            return false;
        }

        for (Song song : library) {
            if(target.getTitle().equalsIgnoreCase(song.getTitle())
                    && target.getArtist().equalsIgnoreCase(song.getArtist())){
                return true;
            }
        }

        return false;
    }

    public boolean add(Song newSong){
        if(newSong == null){
            return false;
        }

        if(containsSong(newSong)){
            return false;
        }

        this.library.add(newSong);
        return true;
    }

    public void display(){
        System.out.println("MusicPlayer[Count=" + MusicPlayer.playerCount + "," +
                " id=" + this.playerId
                + ", owner=" + this.owner + ", library: " + this.library);
    }
}
