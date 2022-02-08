import java.io.*;
public class FileRead {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("filename.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String sum = "";
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                // Print the content on the console
                System.out.println(strLine);
                sum += strLine + " ";
            }
            System.out.println (sum);
            //Close the input stream
            in.close();
        } catch (Exception e) {
            System.err.println("Error :" + e.getMessage());
        }
    }
}
