import java.io.*;

public class Solution {

    public static void main(String[] args) {
        while(true) {
            int x = 0;
            try {
                x = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(x);
        }
    }
}
