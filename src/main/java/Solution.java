import java.io.*;
import java.util.ArrayList;

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

/*
Even characters

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        try (FileReader fileReader = new FileReader(fileName1)) {
            while (fileReader.ready()) {
                list.add(fileReader.read());
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            for (int i = 1; i < list.size(); i = i + 2) {
                fileWriter.write((byte) (int) list.get(i));
            }
        }
    }
}
