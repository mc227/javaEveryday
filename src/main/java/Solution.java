import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.LockSupport;

public class Solution {
    public static void main(String []args) throws InterruptedException {
        Runnable task = () -> {
            // Park the current thread
            System.err.println("Will be Parked");
            LockSupport.park();
            // As soon as we are unparked, we will start to act
            System.err.println("Unparked");
        };
        Thread th = new Thread(task);
        th.start();
        Thread.currentThread().sleep(2000);
        System.err.println("Thread state: " + th.getState());

        LockSupport.unpark(th);
        Thread.currentThread().sleep(2000);
    }
}
