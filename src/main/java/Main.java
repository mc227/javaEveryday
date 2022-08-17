import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String data = "You're so vain.";

        try {
            // Create FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Write the string to the file
            output.write(data);

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}