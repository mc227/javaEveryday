import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized(lock) {
                System.out.println("thread");
            }
        };

        Thread th1 = new Thread(task);
        th1.start();
        synchronized(lock) {
            for (int i = 0; i < 4; i++) {
                Thread.currentThread().sleep(1000);
                System.out.print(" " + i);
            }
            System.out.println(" ...");
        }
    }
}
