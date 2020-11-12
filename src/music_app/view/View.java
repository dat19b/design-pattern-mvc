package music_app.view;

import music_app.controller.SongController;
import music_app.model.Song;
import music_app.repository.IObserver;
import music_app.repository.ISongRepository;

import java.util.Scanner;

public class View implements IObserver {

    ISongController songController;

    public void printSongDetails(Song song){
        System.out.println("Now playing: ");
        System.out.println(song.getTitle());
        System.out.println(song.getSongId());
    }

    public int getNewSong(){
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();

    }

    public void addSong(SongController sc){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please add new song:" );
        System.out.print("Song title: ");
        String title = inp.nextLine();
        System.out.print("Song id: ");
        int id = inp.nextInt();
        sc.newSong(title, id);

    }


    @Override
    public void update() {
        System.out.println("Model has been updated");
    }
}
