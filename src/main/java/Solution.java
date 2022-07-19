import java.io.*;

/*
Files and exceptions




Don't use System.exit();
* */
public class Solution {
    public static void main(String[] args) throws IOException {
        // Read file names from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String filename = bufferedReader.readLine();
            try(FileInputStream fileInputStream = new FileInputStream(filename)){
                // If the file does not exist (i.e. an invalid file name is given),
                //then catch the FileNotFoundException,
                // Close the streams.
                fileInputStream.close();
            } catch (FileNotFoundException fileNotFoundException){
                // display the invalid file name,
                System.out.println(filename);
                // and exit the program.
                break;
            }
        }
        // Close the streams.
        bufferedReader.close();
    }
}