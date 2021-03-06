package music_app.controller;

import music_app.model.Song;
import music_app.repository.ISongRepository;
import music_app.view.View;

public class SongController implements ISongsController {

    private ISongRepository model;
    private View view;

    public SongController(ISongRepository model, View view){
        this.model = model;
        this.view = view;
        view.setSongController(this); // lav en reference til denne controller i view.
    }

    public void updateView(int id){
        view.printSongDetails(model.getSong(id));
    }

    public void addSong(){
        System.out.println("SORRY, NOT LOGGED IN");  // jeg må ikke kunne added en ny song hvis jeg ikke er logged in.
        //view.addSong();
    }
    public void newSong(int id, String title){
        //model.addSong(new Song(id, title));
    }
}
