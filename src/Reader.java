import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("filename.txt");
        BufferedReader br = new BufferedReader(in);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        in.close();

    }
}