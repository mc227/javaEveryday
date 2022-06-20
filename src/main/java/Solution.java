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
            fileInputStream1.close();
            fileInputStream2.close();
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.close();
        }
        bufferedReader.close();

    }

}
