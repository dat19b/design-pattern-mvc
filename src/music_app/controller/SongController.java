package music_app.controller;

import music_app.repository.ISongRepository;
import music_app.view.View;

public class SongController {

    private ISongRepository model;
    private View view;

    public SongController(ISongRepository model, View view){
        this.model = model;
        this.view = view;
    }

    public void updateView(int id){
        view.printSongDetails(model.getSong(id));
    }

}
