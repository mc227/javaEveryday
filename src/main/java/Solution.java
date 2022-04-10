import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        });
        System.out.println(2/0);
    }
}
