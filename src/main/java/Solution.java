import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Copy a file on a disk*/
        FileInputStream fileInputStream = new FileInputStream("file1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt");

        while(fileInputStream.available() > 0) {
            int foo = fileInputStream.read();
            fileOutputStream.write(foo);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}