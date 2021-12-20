/*
No interrupt, no dice?
code gym task 1619
*/

public class Solution {
    private static boolean isCancel;
    //    private boolean isCancel = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        isCancel = true;

    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}



//import java.util.ArrayList;
//import java.util.List;
//
//public class Solution {
//    public static byte threadCount = 3;
//    static List<Thread> threads = new ArrayList<>(threadCount);
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void ourInterrupt() {
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
//        for(int i = 0; i < threadCount; i++) {
//            threads.get(i).start();
//        }
//    }
//
//    public static class Water implements Runnable {
//        private String sharedResources;
//
//        public Water(String sharedResources) {
//            this.sharedResources = sharedResources;
//        }
//
//        public void run() {
//            boolean isCurrentThreadInterrupted = false;
//            String threadName =  Thread.currentThread().getName();
//
//            try {
//                while(!isCurrentThreadInterrupted) {
//                    System.out.println("Object " + sharedResources + ", thread " + threadName);
//                    Thread.sleep(1000);
//                    isCurrentThreadInterrupted =  Thread.currentThread().isInterrupted();
//                }
//            } catch (InterruptedException e) {}
//        }
//    }
//}
//
//
//
//
//
////import java.io.BufferedReader;
////import java.io.IOException;
////import java.io.InputStreamReader;
////
////public class Solution {
////    /*
////    Counting Seconds
////    Codegym task 1616
////     */
////    public static void main(String[] args) throws IOException {
////        InputStreamReader in =  new InputStreamReader(System.in);
////        BufferedReader reader = new BufferedReader(in);
////        // Create and run thread
////        Stopwatch stopwatch = new Stopwatch();
////        stopwatch.start();
////        // Read a string
////        reader.readLine();
////        stopwatch.interrupt();
////        // close streams
////        reader.close();
////        in.close();
////    }
////
////    public static class Stopwatch extends Thread {
////        private int seconds;
////
////        public void run() {
////            try {
////                while(true) {
////                    Thread.sleep(1000);
////                    seconds++;
////                }
////            } catch (InterruptedException e) {
////                System.out.println(seconds);
////            }
////        }
////    }
////}
////
//////public class Solution {
//////    public static void main(String[] args) {
//////        System.out.println("Oh Hi Mark");
//////    }
//////}
