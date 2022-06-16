import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;
        while ((i = bufferedInputStream.read()) != -1){
            System.out.print((char) i);
        }
    }
}