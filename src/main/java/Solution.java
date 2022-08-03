import java.io.*;

/*
Even characters
Read 2 file names from the console.
Output to the second file all characters from the first file with an even ordinal number (ordinal numbers start with 1).

Example first file:
text in file
Output in the second file:
eti ie
Close the IO streams.


Requirements:
1. The program should read file names from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the first file's contents (use the FileReader constructor with a String parameter).
4. The file input stream (FileReader) must be closed.
5. The program must write to the second file all chars from the first file with an even ordinal number (use FileWriter).
6. The file output stream (FileWriter) must be closed.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);

        int i = 1;
        while (reader.ready()) {
//            System.out.println(i);
            int data = reader.read(); //Read one character (the char will be widened to an int)
            if(i%2 == 0) {
//                System.out.println(i);
                writer.write(data); //Write one character (the int will be truncated/narrowed to a char)
            }
            i++;

        }


        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
