import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // what are you doing?
        // I saw how files
        // bytes in a file were summed up so
        // here i am kinda doing it from scratch.
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        long sum = 0;
        while(fileInputStream.available() > 0) {
            int foo = fileInputStream.read();
            sum += foo;
        }
        fileInputStream.close();
        System.out.println(sum);
    }
}