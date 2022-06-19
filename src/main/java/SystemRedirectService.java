import java.io.*;

public class SystemRedirectService {
    public static void main(String[] args) {
        try {
            PrintStream fileStream = new PrintStream(new File("mark3.txt"));
            PrintStream console = System.out;
            System.setOut(fileStream);
            System.out.println("This goes to mark3.txt");
            System.setOut(console);
            System.out.println("This one goes out to the console");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
