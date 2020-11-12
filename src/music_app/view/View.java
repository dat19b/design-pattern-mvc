package music_app.view;

import music_app.controller.ISongsController;
import music_app.controller.SongController;
import music_app.model.Song;
import music_app.repository.IObserver;

import java.util.Scanner;

public class View implements IObserver {

    // reference til den controller der er i brug (logged in, eller almindelig)
    ISongsController songController;

    public void setSongController(ISongsController songController) {
        this.songController = songController;
    }

    public void printSongDetails(Song song){
        System.out.println("Now playing: ");
        System.out.println(song.getTitle());
        System.out.println(song.getSongId());
    }

    public int getNewSong(){
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();

    }

    public void addSong(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please add new song:" );
        System.out.print("Song title: ");
        String title = inp.nextLine();
        System.out.print("Song id: ");
        int id = inp.nextInt();
        songController.newSong(id, title);

    }


    @Override
    public void update() {
        System.out.println("Model has been updated");
    }
}
