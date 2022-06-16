import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("mark1.txt");

        printStream.println("Hello!");
        printStream.println("I'm a robot!");

        printStream.printf("My name is %s. I am %d!", "Amigo", 18);

        printStream.close();
    }
}