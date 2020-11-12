package music_app.controller;

import music_app.model.Song;
import music_app.repository.ISongRepository;
import music_app.view.View;

public class LoggedInSongController implements ISongsController {

    private ISongRepository model;
    private View view;

    public LoggedInSongController(ISongRepository model, View view){
        this.model = model;
        this.view = view;
        view.setSongController(this); // dependency injection  / strategy pattern
    }

    public void updateView(int id){
        view.printSongDetails(model.getSong(id));
    }

    public void addSong(){
        view.addSong(); // når jeg er logged in må jeg gerne kunne add song
    }
    public void newSong(int id, String title){
        model.addSong(new Song(id, title));
    }
}
