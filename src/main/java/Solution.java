import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        PrintStream filePrintStream = new PrintStream(new File("mark.txt"));
        filePrintStream.println(222);
        filePrintStream.println("Hello World");
        filePrintStream.println(false);
    }
}