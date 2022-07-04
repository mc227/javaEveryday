
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Finding data inside a file
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

Requirements:
•	The program should read a file name from the console.
•	Create an input stream for the file.
•	The program should search the file and display information related to the specified id passed as the first argument.
•	The stream used to read the file must be closed.
* */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(filename))){
            String str;
            while((str=bufferedFileReader.readLine())!=null){
                if(str.startsWith(args[1] + " ")){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}



