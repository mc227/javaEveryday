import java.io.*;

// Combining files
public class Solution {

    public static void main(String[] args) throws IOException {
        //    Read 2 file names from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        //    Write the contents of the second file to the beginning of the first file so that the files are combined.
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try(FileInputStream fileInputStream1 = new FileInputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2)){
            while(fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }

        //    Close the streams.
        //
        //            Requirements:
        //            •	The program should read a file name twice from the console.
        //•	Create an input stream for the first file and read its contents.
        //•	Then create an output stream for the first file. And an input stream for the second file.
        //•	The contents of the first and second files must be combined in the first file.
        //•	The contents of the second file should go first, then the contents of the first file.
        //•	The file streams must be closed.

}
