import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://www.ufc.com").get();
        String title = doc.title();
        System.out.println(title);
    }
}