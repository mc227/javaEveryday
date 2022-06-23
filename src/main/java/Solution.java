

/*
Finding data inside a file
Read a file name from the console.
Search the file for information
related to the specified id.
Display it in the format used in the file.
The program is started with one argument:
id (an int). Close the streams.
The file data is separated by spaces and stored in the following order: id productName
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(bufferedReader.readLine()))){
            while((str = bufferedFileReader.readLine())!= null) {
                if(str.startsWith(args[0] + " ")){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
