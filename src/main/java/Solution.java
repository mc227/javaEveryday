import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.LockSupport;

public class Solution {
    //task1622
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException{
        for(int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread{
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while(true) {
                System.out.println(this);
                if(--countdownIndex == 0) return;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }

        @Override
        public String toString() {
            return "#" + getName() + ":" + countdownIndex;
        }
    }
}
