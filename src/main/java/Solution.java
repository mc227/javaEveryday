import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Copy a file on disk
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt");
        byte[] buffer = new byte[1000];
        while(fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}