package HFJ3e.Chapter11;

import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);
        // This line intentionally fails compilation
//        Collections.sort(songList);
        System.out.println(songList);
    }
}
