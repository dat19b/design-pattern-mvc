package music_app.repository;

import music_app.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository implements ISongRepository {

    List<Song> songs; // DB

    public SongRepository(){
        songs = new ArrayList<>();
        songs.add(new Song(0, "Hello world"));
        songs.add(new Song(1, "Thriller"));
        songs.add(new Song(2, "Midt om natten"));

    }

    public Song getSong(int id) {
        return songs.get(id);
    }

    public void addSong(Song song){
        songs.add(song);
    }

}
