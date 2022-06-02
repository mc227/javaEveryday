import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Sum up all the bytes in a file*/
        FileInputStream fileInputStream = new FileInputStream("file1.txt");
        long sum = 0;

        while(fileInputStream.available() > 0) {
            int foo = fileInputStream.read();
            sum += foo;
        }
        System.out.println(sum);
        fileInputStream.close();
    }
}