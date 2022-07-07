import java.io.*;
import java.util.*;

/*
Finding data inside a file - 1,2,3,4,5,6,7,8,9,10
Read a file name from the console.
Search the file for information related to the specified id. Display it in the format used in the file.
The program is started with one argument: id (an int).
Close the streams.

The file data is separated by spaces and stored in the following order:
id productName price quantity
where id is an int
productName is a String — it can contain spaces
price is a double
quantity is an int

The information for each product is stored on a separate line.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            String str;
            while((str= bufferedReader.readLine())!=null){
                if(str.startsWith(args[1] + " ")){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
