import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {
/*
Two in one

mark5.txt
mark6.txt
mark7.txt
*/
    public static void main(String[] args) throws IOException {

        try {
            // * Read 3 file names from the console.
            // •	The program should read a file name three times from the console.
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // •	Create an output stream for the first file. For the other two, create input streams.
            String fileString = bufferedReader.readLine();
            FileOutputStream fileOutputStream = new FileOutputStream(fileString);
            // Write the contents of the second file to the first file, and then append the contents of the third
            // file to the first file.
            //        Close the streams.
            FileInputStream fileInputStream1 = new FileInputStream(bufferedReader.readLine());
            FileInputStream fileInputStream2 = new FileInputStream(bufferedReader.readLine());
            Path p = Paths.get(fileString);
            String s = System.lineSeparator() + "New Line!";

            // •	The contents of the second file must be copied to the first file.

            while(fileInputStream1.available() > 0) {
                int data = fileInputStream1.read();
                fileOutputStream.write(data);
            }
            fileOutputStream.write(10);
            while(fileInputStream2.available() > 0) {
                int data = fileInputStream2.read();
                fileOutputStream.write(data);
            }

            fileOutputStream.close();
            fileInputStream1.close();
            fileInputStream2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*



        •	The contents of the third file must be appended to the first file (after the second file has been written to the first file).
        •	The file streams must be closed.*/
    }
}