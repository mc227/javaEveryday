import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        bufferedReader.readLine();
        stopwatch.interrupt();
        bufferedReader.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
