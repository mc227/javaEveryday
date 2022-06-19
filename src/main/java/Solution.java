import java.io.*;
import java.util.Arrays;

public class Solution {
/*
Combining files

*/
    public static void main(String[] args) throws IOException {
        /*
        * Read 2 file names from the console.
        •	The program should read a file name twice from the console.
        */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        /*
        Write the contents of the second file to the beginning of the first file so that the files are combined.

        •	The program should read a file name twice from the console.
        •	Create an input stream for the first file and read its contents.
        */
        // Requirement:Then create an output stream for the first file. And an input stream for the second file.
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        // •	The contents of the first and second files must be combined in the first file.
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file1,true);

        // •	The contents of the second file should go first, then the contents of the first file.


        byte[] buffer1 = new byte[fileInputStream1.available()];
        int count1 = fileInputStream2.read(buffer1);
        System.out.println(Arrays.toString(buffer1));


        byte[] buffer2 = new byte[fileInputStream2.available()];
        int count2 = fileInputStream2.read(buffer2);
        fileOutputStream.write(buffer2,0, count2);
        fileOutputStream2.write(buffer1, 0, count1);

//        byte[] buffer1 = new byte[fileInputStream1.available()];
//        int count1 = fileInputStream1.read(buffer1);
//        fileOutputStream.write(buffer1,0,count1);




        /*
        Close the streams.
        •	The file streams must be closed.
        */
        fileOutputStream.close();
        fileInputStream2.close();
//        fileInputStream1.close();
        bufferedReader.close();

    }
}