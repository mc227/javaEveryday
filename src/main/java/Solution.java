import java.io.*;
import java.util.Locale;

public class Solution {


    public static void main(String[] args) throws IOException {
        String greetings = "Hi! My name is Amigo!\nI'm learning Java on the CodeGym website.\nOne day I will become a cool programmer!\n";
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
