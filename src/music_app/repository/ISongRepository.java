package music_app.repository;

import music_app.model.Song;

public interface ISongRepository {
    Song getSong(int id);
    void addSong(Song song);

    public void addObserver(IObserver v);
}
