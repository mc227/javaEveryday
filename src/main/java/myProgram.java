import java.io.IOException;

public class myProgram {
    public static void main(String[] args) throws IOException {

        // Define two filenames:
        String permFile = "mark5.txt";
        String tmpFile =  "mark6.txt";

        appendFiles appender = new appendFiles(permFile, tmpFile);
    }
}