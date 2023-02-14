package HFJ3e.Chapter11;

import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongsStrings();
        System.out.println(songList);
    }
}
