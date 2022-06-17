import java.io.*;
import java.util.Locale;

public class Solution {


    public static void main(String[] args) throws IOException {
        String greetings = "A stream is, in essence, a moving piece of data.\nIn other words, in programming,\nit " +
                "isn't water that flows - but rather data in the form of bytes and characters";
        byte[] bytes = greetings.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = reader.readLine())!= null) {

            System.out.println(str);
        }

    }

}
