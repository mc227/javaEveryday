import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Testing {

    public static void main(String[] args) throws IOException {

        File file = new File ("C:/Users/Me/Desktop/directory/file.txt");
        PrintWriter printWriter = new PrintWriter ("file.txt");
        printWriter.println ("hello");
        printWriter.close ();
    }
}