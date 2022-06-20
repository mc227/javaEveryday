import java.io.*;

public class appendFiles {
    public appendFiles(String permFile, String tmpFile) {
    }

    public static void appendFiles(String permFile, String tmpFile) throws IOException {
        // Appends file "tmpFile" to the end of "permFile"
        // Code adapted from:  https://www.daniweb.com/software-development/java/threads/44508/appending-two-java-text-files

        try {
            // create a writer for permFile
            BufferedWriter out = new BufferedWriter(new FileWriter(permFile, true));
            // create a reader for tmpFile
            BufferedReader in = new BufferedReader(new FileReader(tmpFile));
            String str;
            while ((str = in.readLine()) != null) {
                out.write(str);
            }
            in.close();
            out.close();
        } catch (IOException e) {
        }
    }


}
