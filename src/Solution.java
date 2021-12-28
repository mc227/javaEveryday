public class Solution {
    public static volatile boolean isStopped = false;

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTickTock();
                }
            } catch (InterruptedException e) {}
        }

        private void printTickTock() throws InterruptedException {
            Thread.sleep(500);
            System.out.println("Tick");
            Thread.sleep(500);
            System.out.println("Tock");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(500);
        isStopped = true;
        System.out.println("The Clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }
}


//public class Solution {
//    public static void main(String[] args) throws InterruptedException {
////        Thread.sleep(100);
////        System.out.println("Oh");
////        Thread.sleep(1000);
////        System.out.println("Hi");
////        Thread.sleep(1000);
////        System.out.println("Mark");
//        while (true) {
//            Thread.sleep(500);
//            System.out.println("Tick");
//        }
//    }
//}
//
//
/////*
////https://codegym.cc/quests/lectures/questcore.level06.lecture05
////12/26/2021 stopped at typing up Horse racing task
////* */
////
////
/////*
////Horse racing
////task 1607
//// */
////
////import java.util.ArrayList;
////import java.util.List;
////
////public class Solution {
////    public static class Horse extends Thread {
////        private boolean isFinished;
////        // constructor
////        public Horse(String name) {
////            super(name);
////        }
////
////        public boolean isFinished() {
////            return isFinished;
////        }
////
////        public void run() {
////            String s = "";
////            for(int i = 0; i < 1001; i++) {
////                s += "" + i;
////                if (i == 1000) {
////                    s = " has finished the race!";
////                    System.out.println(getName() + s);
////                    isFinished = true;
////                }
////            }
////        }
////    }
////
////    public static List<Horse> prepareHorsesAndStart(int horseCount) {
////        List<Horse> horses = new ArrayList<>(horseCount);
////        String number;
////        for(int i = 1; i < horseCount + 1; i++) {
////            number = i < 10 ? ("0" + i) : "" + i;
////            horses.add(new Horse("Horse_" + number));
////        }
////        for (int i = 0; i < horseCount; i++) {
////            horses.get(i).start();
////        }
////        return horses;
////    }
////
////    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
////        int finishedCount = 0;
////        for(Horse horse: horses) {
////            if(!horse.isFinished()) {
////                System.out.println("Waiting for " + horse.getName());
////                horse.join();
////            } else {
////                finishedCount +=1;
////            }
////        }
////        return finishedCount;
////    }
////
////    public static void main(String[] args) throws InterruptedException {
////        List<Horse> horses =  prepareHorsesAndStart(10);
////        while (calculateHorsesFinished(horses) != horses.size()) {
////            System.out.println("not everyone is finished");
////        }
////    }
////}
//
//
/////*
////No interrupt, no dice?
////code gym task 1619
////*/
////
////public class Solution {
////    private static boolean isCancel;
////    //    private boolean isCancel = false;
////    public static void main(String[] args) throws InterruptedException {
////        Thread t = new Thread(new TestThread());
////        t.start();
////        Thread.sleep(3000);
////        ourInterrupt();
////    }
////
////    public static void ourInterrupt() {
////        isCancel = true;
////    }
////
////    public static class TestThread implements Runnable {
////        public void run() {
////            while (!isCancel) {
////                try {
////                    System.out.println("he-he");
////                    Thread.sleep(500);
////                } catch (InterruptedException e) {
////                }
////            }
////        }
////    }
////}
////
////
////
//////import java.util.ArrayList;
//////import java.util.List;
//////
//////public class Solution {
//////    public static byte threadCount = 3;
//////    static List<Thread> threads = new ArrayList<>(threadCount);
//////
//////    public static void main(String[] args) {
//////
//////    }
//////
//////    public static void ourInterrupt() {
//////        threads.get(0).interrupt();
//////        threads.get(1).interrupt();
//////        threads.get(2).interrupt();
//////    }
//////
//////    public static void initThreadsAndStart() {
//////        Water water = new Water("water");
//////        for(int i = 0; i < threadCount; i++) {
//////            threads.add(new Thread(water, "#" + i));
//////        }
//////        for(int i = 0; i < threadCount; i++) {
//////            threads.get(i).start();
//////        }
//////    }
//////
//////    public static class Water implements Runnable {
//////        private String sharedResources;
//////
//////        public Water(String sharedResources) {
//////            this.sharedResources = sharedResources;
//////        }
//////
//////        public void run() {
//////            boolean isCurrentThreadInterrupted = false;
//////            String threadName =  Thread.currentThread().getName();
//////
//////            try {
//////                while(!isCurrentThreadInterrupted) {
//////                    System.out.println("Object " + sharedResources + ", thread " + threadName);
//////                    Thread.sleep(1000);
//////                    isCurrentThreadInterrupted =  Thread.currentThread().isInterrupted();
//////                }
//////            } catch (InterruptedException e) {}
//////        }
//////    }
//////}
//////
//////
//////
//////
//////
////////import java.io.BufferedReader;
////////import java.io.IOException;
////////import java.io.InputStreamReader;
////////
////////public class Solution {
////////    /*
////////    Counting Seconds
////////    Codegym task 1616
////////     */
////////    public static void main(String[] args) throws IOException {
////////        InputStreamReader in =  new InputStreamReader(System.in);
////////        BufferedReader reader = new BufferedReader(in);
////////        // Create and run thread
////////        Stopwatch stopwatch = new Stopwatch();
////////        stopwatch.start();
////////        // Read a string
////////        reader.readLine();
////////        stopwatch.interrupt();
////////        // close streams
////////        reader.close();
////////        in.close();
////////    }
////////
////////    public static class Stopwatch extends Thread {
////////        private int seconds;
////////
////////        public void run() {
////////            try {
////////                while(true) {
////////                    Thread.sleep(1000);
////////                    seconds++;
////////                }
////////            } catch (InterruptedException e) {
////////                System.out.println(seconds);
////////            }
////////        }
////////    }
////////}
////////
//////////public class Solution {
//////////    public static void main(String[] args) {
//////////        System.out.println("Oh Hi Mark");
//////////    }
//////////}
