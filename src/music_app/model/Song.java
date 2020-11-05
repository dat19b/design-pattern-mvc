package music_app.model;

public class Song {

    private int songId;
    private String title;

    public Song(int songId, String title) {
        this.songId = songId;
        this.title = title;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
