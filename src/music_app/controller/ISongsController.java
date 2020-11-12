package music_app.controller;

public interface ISongsController {
        public void updateView(int id);
        public void addSong();
        public void newSong(int songId, String title);

}
