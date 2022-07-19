/*
Encryption
Come up with an encryption/decryption mechanism.

The program runs with one of the following sets of arguments:
-e fileName fileOutputName
-d fileName fileOutputName

where:
fileName is the name of a file to be encrypted/decrypted.
fileOutputName is the name of the file where you need to write the result of the encryption/decryption process.
-e indicates that you need to encrypt the data.
-d indicates that you need to decrypt the data.

Requirements:
•	You don't need to read anything from the console.
•	Create an input stream for the file passed as the second argument (fileName).
•	Create an output stream for the file passed as the third argument (fileOutputName).
•	In "-e" mode, the program should encrypt fileName and write the result to fileOutputName.
•	In "-d" mode, the program should decrypt fileName and write the result to fileOutputName.
•	The file streams must be closed.
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if(!(mode.equals("-e") || mode.equals("-d"))) return;
        try(FileInputStream fileInputStream = new FileInputStream(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2])){

            if(mode.equals("-e")){
                while(fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read()+32);
                }
            } else {
                while(fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read()-32);
                }
            }
        }
    }
}
