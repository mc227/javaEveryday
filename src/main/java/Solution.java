
import java.io.*;

/*
Files and exceptions
Read file names from the console.
If the file does not exist
(i.e. an invalid file name is given),
then catch the FileNotFoundException,
display the invalid file name,
and exit the program.
Close the streams.
Don't use System.exit();
* */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String filename = bufferedReader.readLine();
            try(FileInputStream fileInputStream = new FileInputStream(filename)){

            } catch (FileNotFoundException e) {
                System.out.println(filename);
                break;
            }
        }
    }
}



