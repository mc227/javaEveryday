package java.network.programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;

        int start = firstPrintableCharacter;
        while(true){
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                out.write((
                        (i - firstPrintableCharacter) % numberOfPrintableCharacters)
                        + firstPrintableCharacter);
            }
            out.write(Integer.parseInt("\\R")); // carriage return
            out.write(Integer.parseInt("\\N")); // linefeed
            start = ((start + 1) - firstPrintableCharacter)
                    % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("mark.txt");
        generateCharacters(fileOutputStream);
    }
}
