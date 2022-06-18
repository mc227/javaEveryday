import java.io.*;
import java.net.URL;

public class Solution {

    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://info.cern.ch/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
