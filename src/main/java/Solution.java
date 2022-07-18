/*
Files and exception




Close the streams.
Don't use System.exit();

Requirements:
•	The program should read file names from the console.
•	You need to create an input stream for each file.
•	If the file does not exist, the program must catch the FileNotFoundException.
•	After catching the exception, the program should display the file name and exit.
•	The file input streams must be closed.
•	Don't use "System.exit();".
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Read file names from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String filename = bufferedReader.readLine();
            try(FileInputStream fileInputStream = new FileInputStream(filename)){
                // If the file does not exist
                //(i.e. an invalid file name is given),
                //then catch the FileNotFoundException,
                fileInputStream.close();
            } catch (FileNotFoundException fileNotFoundException){
                // display the invalid file name,
                System.out.println(filename);
                // and exit the program.
                break;
            }
        }
    }
}
