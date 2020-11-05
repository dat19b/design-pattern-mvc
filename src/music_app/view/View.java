package music_app.view;

import music_app.model.Song;

import java.util.Scanner;

public class View {

    public void printSongDetails(Song song){
        System.out.println("Now playing: ");
        System.out.println(song.getTitle());
        System.out.println(song.getSongId());
    }

    public int getNewSong(){
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();

    }



}
