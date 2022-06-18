import java.io.*;

public class SystemRedirectService {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream(new File("mark2.txt"));
            PrintStream console = System.out;
            System.setOut(printStream);
            System.out.println("This will be written in the file");
//            PrintStream console = System.out;
            System.setOut(console);
            System.out.println("This will be written in the console");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
