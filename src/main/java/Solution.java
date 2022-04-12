import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = ()  -> {
            synchronized (lock) {
                System.out.println("Here");
                System.out.println("thread");
            }
        };

        Thread th1 = new Thread(task);
        th1.start();
//        System.out.println(th1.getThreadGroup());
//        System.out.println(th1.getName());
//        System.out.println(th1.getState());
        synchronized (lock) {
            for(int i = 0; i < 8; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().sleep(1000);
                System.out.print(" " + i);
            }
            System.out.println("...");
        }
    }
}
