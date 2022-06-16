import java.io.*;
import java.util.Locale;

public class Solution {
    private static final String GREETINGS_MESSAGE = "My name is %s. I am %d!";

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("mark2.txt");

        printStream.println("Hello!");
        printStream.println("We are robots!");


        printStream.printf(GREETINGS_MESSAGE, "Amigo", 18);
        printStream.printf(GREETINGS_MESSAGE, "R2-D2", 35);
        printStream.printf(GREETINGS_MESSAGE, "C-3PO", 35);

        printStream.close();
    }
}