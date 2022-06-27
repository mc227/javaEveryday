


import java.io.*;
/*
*
Finding data inside a file
Read a file name from the console.
* Search the file for information
* related to the specified id.
* Display it in the format
* used in the file.
* The program is started with
* one argument: id (an int).
* Close the streams.
* The file data is separated by
* spaces and stored in the following
* order: id productName
* */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
            String str;
            while((str = bufferedFileReader.readLine()) != null) {
                if(str.startsWith(args[1] + " ")){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
