import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        //Create a FileInputStream object bound to «c:/data.txt».
        FileInputStream inputStream = new FileInputStream("data.txt");
        long sum = 0;

        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            int data = inputStream.read(); //Read the next byte
            System.out.println(data);
            sum +=  data; //Add it to the running total
        }
        inputStream.close(); // Close the stream

        System.out.println(sum); // Display the sum on the screen.
    }

}