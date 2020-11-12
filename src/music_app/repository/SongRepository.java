package music_app.repository;

import music_app.model.Song;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SongRepository implements ISongRepository {

    List<Song> songs; // DB
    private Set<IObserver> observers = new HashSet<>();

    public SongRepository(){
        songs = new ArrayList<>();
        songs.add(new Song(0, "Hello world"));
        songs.add(new Song(1, "Thriller"));
        songs.add(new Song(2, "Midt om natten"));

    }

    public void addObserver(IObserver v){
        observers.add(v);
    }

    public Song getSong(int id) {
        return songs.get(id);
    }

    public void addSong(Song song){
        songs.add(song);

        for (IObserver o: observers) {
            o.update();
        }
    }



}
