package HFJ3e.Chapter11;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();
        songs.add("Boom Boom");
        songs.add("Baam");
        songs.add("I'm so hot");
        songs.add("Welcome to Momoland");
        return songs;
    }

    public static List<SongV2> getSongsV2() {
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("Boom Boom","Momoland",126));
        songs.add(new SongV2("Baam","Momoland",127));
        songs.add(new SongV2("I'm so hot","Momoland",127));
        songs.add(new SongV2("Welcome to Momoland","Momoland",170));
        return songs;
    }
}
