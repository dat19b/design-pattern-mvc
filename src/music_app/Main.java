package music_app;

import music_app.controller.SongController;
import music_app.repository.ISongRepository;
import music_app.repository.SongRepository;
import music_app.view.View;

public class Main {

    public static void main(String[] args) {
        // model
        ISongRepository model = new SongRepository();
        // view
        View view = new View();
        // controller
        SongController controller = new SongController(model, view);

        // event loop
        controller.updateView(1);

        boolean eventloop = true;
        while(eventloop){
            int x = view.getNewSong();
            if (x != -1){
                controller.updateView(x);
            } else {
                eventloop = false;
            }
        }


    }
}
