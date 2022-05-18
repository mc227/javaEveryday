import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        //Create a stream to read bytes from a file
        FileInputStream inputStream = new FileInputStream("data.txt");
        //Create a stream to write bytes to a file
        FileOutputStream outputStream = new FileOutputStream("result.txt");

        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            int data = inputStream.read(); // Read the next byte into the data variable
            outputStream.write(data); // and write it to the second stream
        }

        inputStream.close(); //Close both streams. We don't need them any more.
        outputStream.close();
    }
}