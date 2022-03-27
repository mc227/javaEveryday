
import java.util.ArrayList;
import java.util.List;

/*
One for all, all for one

*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        //write your code here
        threads.get(0).interrupt();
        threads.get(1).interrupt();
        threads.get(2).interrupt();
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables
            boolean isCurrentThreadInterrupted = false;
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                    isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}


//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static byte threadCount = 3;
//    static List<Thread> threads =  new ArrayList<>(threadCount);
//
//    public static void main(String[] args) throws InterruptedException {
//        initThreadsAndStart();
//        Thread.sleep(3000);
//        outInterrupt();
//    }
//
//    private static void outInterrupt() {
//        threads.get(0).interrupt();
//        threads.get(1).interrupt();
//        threads.get(2).interrupt();
//    }
//
//    public static void initThreadsAndStart() {
//        Water water = new Water("water");
//        for(int i = 0; i < threadCount; i++) {
//            threads.add(new Thread(water, "#" + i));
//        }
//
//        for(int i = 0; i < threadCount; i++) {
//            threads.get(i).start();
//        }
//    }
//
//
//    public static class Water implements Runnable{
//        private String sharedResource;
//
//        public Water(String sharedResource) {
//            this.sharedResource = sharedResource;
//        }
//
//        public void run() {
//            boolean isCurrentThreadInterrupted = false;
//            String threadName = Thread.currentThread().getName();
//
//            try {
//                while (!isCurrentThreadInterrupted) {
//                    System.out.println("Object " +  sharedResource + " thread " + threadName);
//                    Thread.sleep(1000);
//                    isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
//                }
//            } catch (InterruptedException e) {
//
//            }
//        }
//    }
//}