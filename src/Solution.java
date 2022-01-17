import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            boolean isCurrentThreadInterrupted = false;
            String threadName = Thread.currentThread().getName();

            try {
                while(!isCurrentThreadInterrupted) {
                    System.out.println("Object " + sharedResource + ", thread " + threadName );
                    Thread.sleep(1000);
                    isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
                }
            } catch (InterruptedException e) {}
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("Water");
        for (int i = 0; i < threadCount; i++) {
// right here, Mark!!!
        }
    }
}


//public class Solution {
//    private static boolean isCancel;
//
//    public static void outInterrupt() {
//        isCancel = true;
//    }
//
//    public static class TestThread implements Runnable {
//
//        @Override
//        public void run() {
//            while(!isCancel) {
//                try {
//                    System.out.println("he-he");
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {}
//            }
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException{
//        Thread t = new Thread(new TestThread());
//        t.start();
//        Thread.sleep(3000);
//        outInterrupt();
//    }
//}
//
//
////public class Solution {
////    /*
////    Another Interruption
////     */
////    public static class TestThread extends Thread {
////        @Override
////        public void run() {
////            super.run();
////            System.out.println("Oh Hai, Mark!!!");
////        }
////    }
////
////    public static void main(String[] args) throws InterruptedException{
////        TestThread testThread = new TestThread();
////        testThread.start();
////        System.out.println("before Interrupt");
////        testThread.interrupt();
////        System.out.println("after interrupt");
////    }
////}
////
////
////
////
//////public class Solution {
//////    public static volatile int numSeconds = 3;
////////    public static volatile int numSeconds = 4;
//////
//////    public static void main(String[] args) throws InterruptedException {
//////        RacingClock clock = new RacingClock();
//////        //write your code here
//////        Thread.sleep(3500);
//////        clock.interrupt();
//////    }
//////
//////    public static class RacingClock extends Thread {
//////        public RacingClock() {
//////            start();
//////        }
//////
//////        public void run() {
//////            //write your code here
//////            if (numSeconds < 3.5) {
//////                while(numSeconds >=0) {
//////                    try {
//////                        Thread.sleep(1000);
//////                        if(numSeconds ==0) {
//////                            System.out.print("Go!");
//////                        } else {
//////                            System.out.print(numSeconds+" ");
//////                        }
//////                        numSeconds--;
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
//////                }
//////            } else {
//////                while(numSeconds >=0) {
//////                    try {
//////                        Thread.sleep(1000);
//////                        if(numSeconds ==0) {
//////                            System.out.print("Interrupted!");
//////                        } else {
//////                            System.out.print(numSeconds+" ");
//////                        }
//////                        numSeconds--;
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
//////                }
//////            }
//////        }
//////    }
//////}
//////
//////
//////
////////public class Solution {
////////    public static volatile int numSeconds = 3;
////////
////////    public static class RagingClock extends Thread {
////////        public RagingClock() {
////////            start();
////////        }
////////        public void run() {
////////            if (numSeconds < 3.5) {
////////                while (numSeconds >= 0) {
////////                    try {
////////                        Thread.sleep(1000);
////////                        if (numSeconds == 0) {
////////                            System.out.print("Go!");
////////                        } else {
////////                            System.out.print(numSeconds + " ");
////////                        }
////////                        numSeconds--;
////////                    } catch (InterruptedException e) {
////////                        e.printStackTrace();
////////                    }
////////                }
////////            } else {
////////                while (numSeconds >= 0) {
////////                    try {
////////                        Thread.sleep(1000);
////////                        if (numSeconds == 0) {
////////                            System.out.print("Interrupted!");
////////                        } else {
////////                            System.out.print(numSeconds + " ");
////////                        }
////////                        numSeconds--;
////////                    } catch (InterruptedException e) {
////////                        e.printStackTrace();
////////                    }
////////                }
////////            }
////////        }
////////    }
////////    public static void main(String[] args) throws InterruptedException {
////////        RagingClock clock = new RagingClock();
////////        Thread.sleep(1000);
////////        clock.interrupt();
////////    }
////////}
////////
////////
//////////import java.io.BufferedReader;
//////////import java.io.IOException;
//////////import java.io.InputStreamReader;
//////////
//////////public class Solution {
//////////    // Counting seconds
//////////    public static void main(String[] args) throws IOException {
//////////        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//////////        // Create and run thread
//////////        Stopwatch stopwatch = new Stopwatch();
//////////        stopwatch.start();
//////////        // read a string
//////////        reader.readLine();
//////////        stopwatch.interrupt();
//////////        // close streams
//////////        reader.close();
//////////
//////////    }
//////////}
//////////
////////////public class Solution {
////////////
////////////    public static void main(String[] args) throws InterruptedException {
////////////        Clock clock =  new Clock();
////////////        Thread clockThread = new Thread(clock);
////////////        clockThread.start();
////////////
////////////        Thread.sleep(10000);
////////////        clockThread.interrupt();
////////////    }
////////////}
////////////
//////////////public class Solution {
//////////////    // i still need to understand the use of synchronized and this
//////////////    public static volatile Runway RUNWAY = new Runway();
//////////////
//////////////    public static class Runway {
//////////////        private Thread t;
//////////////
//////////////        public Thread getCurrentPlane() {
//////////////            return t;
//////////////        }
//////////////
//////////////        public void setCurrentPlane(Thread t) {
//////////////            synchronized (this) {
//////////////                this.t = t;
//////////////            }
//////////////        }
//////////////
//////////////        public boolean trySetCurrentPlane(Thread t) {
//////////////            synchronized (this) {
//////////////                if (this.t == null) {
//////////////                    this.t = t;
//////////////                    return true;
//////////////                }
//////////////                return false;
//////////////            }
//////////////        }
//////////////    }
//////////////
//////////////    private static void waitForTakeoff() {
//////////////        try {
//////////////            Thread.sleep(100);
//////////////        } catch (InterruptedException e) {
//////////////            e.printStackTrace();
//////////////        }
//////////////    }
//////////////
//////////////    private static void takeOff() {
//////////////        try {
//////////////            Thread.sleep(100);
//////////////        } catch (InterruptedException ignored) {}
//////////////    }
//////////////
//////////////    public static class Plane extends Thread {
//////////////        public Plane(String name) {
//////////////            super(name);
//////////////            start();
//////////////        }
//////////////
//////////////        public void run() {
//////////////            boolean hasAlreadyTakenOff = false;
//////////////            while(!hasAlreadyTakenOff) {
//////////////                if (RUNWAY.trySetCurrentPlane(this)) {
//////////////                    System.out.println(getName() + " is flying");
//////////////                    takeOff();
//////////////                    System.out.println(getName() + " in the sky");
//////////////                    hasAlreadyTakenOff = true;
//////////////                    RUNWAY.setCurrentPlane(null);
//////////////                } else if(!this.equals(RUNWAY.getCurrentPlane())) {
//////////////                    System.out.println(getName() + " is waiting");
//////////////                    waitForTakeoff();
//////////////                }
//////////////            }
//////////////        }
//////////////    }
//////////////
//////////////    public static void main(String[] args) {
//////////////        Plane plane1 = new Plane("Plane #1");
//////////////        Plane plane2 = new Plane("Plane #2");
//////////////        Plane plane3 = new Plane("Plane #3");
//////////////    }
//////////////}
//////////////
////////////////import java.util.ArrayList;
////////////////import java.util.List;
////////////////
////////////////public class Solution {
////////////////    // Countdown. not final
////////////////    public static volatile List<String> list = new ArrayList<>(5);
////////////////
////////////////    static {
////////////////        for (int i = 0; i < 5; i++) {
////////////////            list.add("Line " + i);
////////////////        }
////////////////    }
////////////////
////////////////    public static void main(String[] args) {
////////////////        Thread t =  new Thread(new Countdown(3), "Countdown");
////////////////        t.start();
////////////////    }
////////////////
////////////////    public static class Countdown implements Runnable {
////////////////        private int countFrom;
////////////////
////////////////        public Countdown(int countFrom) {
////////////////            this.countFrom = countFrom;
////////////////        }
////////////////
////////////////        public void run() {
////////////////            try {
////////////////                while (countFrom > 0) {
////////////////                    printCountdown();
////////////////                }
////////////////            } catch (InterruptedException e) {}
////////////////        }
////////////////        public void printCountdown() throws InterruptedException {
////////////////            Thread.sleep(500);
////////////////            countFrom--;
////////////////            System.out.println(list.get(countFrom));
////////////////        }
////////////////    }
////////////////}
////////////////
//////////////////public class Solution {
//////////////////    /*
//////////////////    Big Ben
//////////////////    */
//////////////////
//////////////////    public static volatile boolean isStopped = false;
//////////////////
//////////////////    public static class Clock extends Thread {
//////////////////        private String cityName;
//////////////////        private int hours;
//////////////////        private int minutes;
//////////////////        private int seconds;
//////////////////
//////////////////        public Clock(String cityName, int hours, int minutes, int seconds) {
//////////////////            this.cityName = cityName;
//////////////////            this.hours = hours;
//////////////////            this.minutes = minutes;
//////////////////            this.seconds = seconds;
//////////////////            start();
//////////////////        }
//////////////////
//////////////////        public void run() {
//////////////////            try {
//////////////////                while(!isStopped) {
//////////////////                    printTime();
//////////////////                }
//////////////////            } catch (InterruptedException e) {
//////////////////
//////////////////            }
//////////////////
//////////////////        }
//////////////////
//////////////////        private void printTime() throws InterruptedException {
//////////////////            Thread.sleep(1000);
//////////////////            this.seconds +=1;
//////////////////            if (this.seconds == 60) {
//////////////////                this.seconds = 0;
//////////////////                this.minutes +=1;
//////////////////            }
//////////////////            if (this.minutes == 60) {
//////////////////                this.minutes = 0;
//////////////////                this.hours += 1;
//////////////////            }
//////////////////            if(this.hours == 24) {
//////////////////                this.hours = 0;
//////////////////            }
//////////////////
//////////////////
//////////////////            if (hours == 0 && minutes == 0 && seconds == 0) {
//////////////////                System.out.println(String.format("It's currently midnight in %s!", cityName));
//////////////////            } else {
//////////////////                System.out.println(String.format("In %s, the time is now %02d:%02d:%02d!", cityName, hours, minutes, seconds));
//////////////////            }
//////////////////        }
//////////////////    }
//////////////////    public static void main(String[] args) throws InterruptedException {
//////////////////        Clock clock = new Clock("London", 23, 59, 57);
//////////////////        Thread.sleep(4000);
//////////////////        isStopped = true;
//////////////////        Thread.sleep(1000);
//////////////////    }
//////////////////}
//////////////////
//////////////////
//////////////////
//////////////////
////////////////////
////////////////////public class Solution {
////////////////////    public static volatile boolean isStopped = false;
////////////////////
////////////////////    public static class Stopwatch extends Thread {
////////////////////        private Runner owner;
////////////////////        private int stepNumber;
////////////////////
////////////////////        public Stopwatch(Runner runner) {
////////////////////            this.owner =  runner;
////////////////////        }
////////////////////
////////////////////        public void run() {
////////////////////            try {
////////////////////                while(!isStopped) {
////////////////////                    doStep();
////////////////////                }
////////////////////            } catch (InterruptedException e) {}
////////////////////        }
////////////////////
////////////////////        private void doStep() throws InterruptedException {
////////////////////            stepNumber++;
////////////////////            Thread.sleep(1000/owner.getSpeed());
////////////////////            System.out.println(owner.getName() + " takes step " + stepNumber + "!");
////////////////////        }
////////////////////    }
////////////////////
////////////////////    public static class Runner {
////////////////////        Stopwatch stopwatch;
////////////////////        private String name;
////////////////////        private int speed;
////////////////////
////////////////////        public Runner(String name, int speed) {
////////////////////            this.name = name;
////////////////////            this.speed = speed;
////////////////////            this.stopwatch = new Stopwatch(this);
////////////////////        }
////////////////////
////////////////////        public String getName() {
////////////////////            return name;
////////////////////        }
////////////////////
////////////////////        public int getSpeed() {
////////////////////            return speed;
////////////////////        }
////////////////////
////////////////////        public void start() {
////////////////////            stopwatch.start();
////////////////////        }
////////////////////    }
////////////////////}
////////////////////
////////////////////
////////////////////
//////////////////////public class Solution {
//////////////////////    public static volatile boolean isStopped = false;
//////////////////////
//////////////////////    public static class Clock extends Thread {
//////////////////////        public Clock() {
//////////////////////            setPriority(MAX_PRIORITY);
//////////////////////            start();
//////////////////////        }
//////////////////////
//////////////////////        public void run() {
//////////////////////            try {
//////////////////////                while (!isStopped) {
//////////////////////                    printTickTock();
//////////////////////                }
//////////////////////            } catch (InterruptedException e) {}
//////////////////////        }
//////////////////////
//////////////////////        private void printTickTock() throws InterruptedException {
//////////////////////            Thread.sleep(500);
//////////////////////            System.out.println("Tick");
//////////////////////            Thread.sleep(500);
//////////////////////            System.out.println("Tock");
//////////////////////        }
//////////////////////    }
//////////////////////
//////////////////////    public static void main(String[] args) throws InterruptedException {
//////////////////////        Clock clock = new Clock();
//////////////////////        Thread.sleep(500);
//////////////////////        isStopped = true;
//////////////////////        System.out.println("The Clock has to be stopped");
//////////////////////        Thread.sleep(2000);
//////////////////////        System.out.println("Double-check");
//////////////////////    }
//////////////////////}
//////////////////////
//////////////////////
////////////////////////public class Solution {
////////////////////////    public static void main(String[] args) throws InterruptedException {
//////////////////////////        Thread.sleep(100);
//////////////////////////        System.out.println("Oh");
//////////////////////////        Thread.sleep(1000);
//////////////////////////        System.out.println("Hi");
//////////////////////////        Thread.sleep(1000);
//////////////////////////        System.out.println("Mark");
////////////////////////        while (true) {
////////////////////////            Thread.sleep(500);
////////////////////////            System.out.println("Tick");
////////////////////////        }
////////////////////////    }
////////////////////////}
////////////////////////
////////////////////////
///////////////////////////*
//////////////////////////https://codegym.cc/quests/lectures/questcore.level06.lecture05
//////////////////////////12/26/2021 stopped at typing up Horse racing task
//////////////////////////* */
//////////////////////////
//////////////////////////
///////////////////////////*
//////////////////////////Horse racing
//////////////////////////task 1607
////////////////////////// */
//////////////////////////
//////////////////////////import java.util.ArrayList;
//////////////////////////import java.util.List;
//////////////////////////
//////////////////////////public class Solution {
//////////////////////////    public static class Horse extends Thread {
//////////////////////////        private boolean isFinished;
//////////////////////////        // constructor
//////////////////////////        public Horse(String name) {
//////////////////////////            super(name);
//////////////////////////        }
//////////////////////////
//////////////////////////        public boolean isFinished() {
//////////////////////////            return isFinished;
//////////////////////////        }
//////////////////////////
//////////////////////////        public void run() {
//////////////////////////            String s = "";
//////////////////////////            for(int i = 0; i < 1001; i++) {
//////////////////////////                s += "" + i;
//////////////////////////                if (i == 1000) {
//////////////////////////                    s = " has finished the race!";
//////////////////////////                    System.out.println(getName() + s);
//////////////////////////                    isFinished = true;
//////////////////////////                }
//////////////////////////            }
//////////////////////////        }
//////////////////////////    }
//////////////////////////
//////////////////////////    public static List<Horse> prepareHorsesAndStart(int horseCount) {
//////////////////////////        List<Horse> horses = new ArrayList<>(horseCount);
//////////////////////////        String number;
//////////////////////////        for(int i = 1; i < horseCount + 1; i++) {
//////////////////////////            number = i < 10 ? ("0" + i) : "" + i;
//////////////////////////            horses.add(new Horse("Horse_" + number));
//////////////////////////        }
//////////////////////////        for (int i = 0; i < horseCount; i++) {
//////////////////////////            horses.get(i).start();
//////////////////////////        }
//////////////////////////        return horses;
//////////////////////////    }
//////////////////////////
//////////////////////////    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
//////////////////////////        int finishedCount = 0;
//////////////////////////        for(Horse horse: horses) {
//////////////////////////            if(!horse.isFinished()) {
//////////////////////////                System.out.println("Waiting for " + horse.getName());
//////////////////////////                horse.join();
//////////////////////////            } else {
//////////////////////////                finishedCount +=1;
//////////////////////////            }
//////////////////////////        }
//////////////////////////        return finishedCount;
//////////////////////////    }
//////////////////////////
//////////////////////////    public static void main(String[] args) throws InterruptedException {
//////////////////////////        List<Horse> horses =  prepareHorsesAndStart(10);
//////////////////////////        while (calculateHorsesFinished(horses) != horses.size()) {
//////////////////////////            System.out.println("not everyone is finished");
//////////////////////////        }
//////////////////////////    }
//////////////////////////}
////////////////////////
////////////////////////
///////////////////////////*
//////////////////////////No interrupt, no dice?
//////////////////////////code gym task 1619
//////////////////////////*/
//////////////////////////
//////////////////////////public class Solution {
//////////////////////////    private static boolean isCancel;
//////////////////////////    //    private boolean isCancel = false;
//////////////////////////    public static void main(String[] args) throws InterruptedException {
//////////////////////////        Thread t = new Thread(new TestThread());
//////////////////////////        t.start();
//////////////////////////        Thread.sleep(3000);
//////////////////////////        ourInterrupt();
//////////////////////////    }
//////////////////////////
//////////////////////////    public static void ourInterrupt() {
//////////////////////////        isCancel = true;
//////////////////////////    }
//////////////////////////
//////////////////////////    public static class TestThread implements Runnable {
//////////////////////////        public void run() {
//////////////////////////            while (!isCancel) {
//////////////////////////                try {
//////////////////////////                    System.out.println("he-he");
//////////////////////////                    Thread.sleep(500);
//////////////////////////                } catch (InterruptedException e) {
//////////////////////////                }
//////////////////////////            }
//////////////////////////        }
//////////////////////////    }
//////////////////////////}
//////////////////////////
//////////////////////////
//////////////////////////
////////////////////////////import java.util.ArrayList;
////////////////////////////import java.util.List;
////////////////////////////
////////////////////////////public class Solution {
////////////////////////////    public static byte threadCount = 3;
////////////////////////////    static List<Thread> threads = new ArrayList<>(threadCount);
////////////////////////////
////////////////////////////    public static void main(String[] args) {
////////////////////////////
////////////////////////////    }
////////////////////////////
////////////////////////////    public static void ourInterrupt() {
////////////////////////////        threads.get(0).interrupt();
////////////////////////////        threads.get(1).interrupt();
////////////////////////////        threads.get(2).interrupt();
////////////////////////////    }
////////////////////////////
////////////////////////////    public static void initThreadsAndStart() {
////////////////////////////        Water water = new Water("water");
////////////////////////////        for(int i = 0; i < threadCount; i++) {
////////////////////////////            threads.add(new Thread(water, "#" + i));
////////////////////////////        }
////////////////////////////        for(int i = 0; i < threadCount; i++) {
////////////////////////////            threads.get(i).start();
////////////////////////////        }
////////////////////////////    }
////////////////////////////
////////////////////////////    public static class Water implements Runnable {
////////////////////////////        private String sharedResources;
////////////////////////////
////////////////////////////        public Water(String sharedResources) {
////////////////////////////            this.sharedResources = sharedResources;
////////////////////////////        }
////////////////////////////
////////////////////////////        public void run() {
////////////////////////////            boolean isCurrentThreadInterrupted = false;
////////////////////////////            String threadName =  Thread.currentThread().getName();
////////////////////////////
////////////////////////////            try {
////////////////////////////                while(!isCurrentThreadInterrupted) {
////////////////////////////                    System.out.println("Object " + sharedResources + ", thread " + threadName);
////////////////////////////                    Thread.sleep(1000);
////////////////////////////                    isCurrentThreadInterrupted =  Thread.currentThread().isInterrupted();
////////////////////////////                }
////////////////////////////            } catch (InterruptedException e) {}
////////////////////////////        }
////////////////////////////    }
////////////////////////////}
////////////////////////////
////////////////////////////
////////////////////////////
////////////////////////////
////////////////////////////
//////////////////////////////import java.io.BufferedReader;
//////////////////////////////import java.io.IOException;
//////////////////////////////import java.io.InputStreamReader;
//////////////////////////////
//////////////////////////////public class Solution {
//////////////////////////////    /*
//////////////////////////////    Counting Seconds
//////////////////////////////    Codegym task 1616
//////////////////////////////     */
//////////////////////////////    public static void main(String[] args) throws IOException {
//////////////////////////////        InputStreamReader in =  new InputStreamReader(System.in);
//////////////////////////////        BufferedReader reader = new BufferedReader(in);
//////////////////////////////        // Create and run thread
//////////////////////////////        Stopwatch stopwatch = new Stopwatch();
//////////////////////////////        stopwatch.start();
//////////////////////////////        // Read a string
//////////////////////////////        reader.readLine();
//////////////////////////////        stopwatch.interrupt();
//////////////////////////////        // close streams
//////////////////////////////        reader.close();
//////////////////////////////        in.close();
//////////////////////////////    }
//////////////////////////////
//////////////////////////////    public static class Stopwatch extends Thread {
//////////////////////////////        private int seconds;
//////////////////////////////
//////////////////////////////        public void run() {
//////////////////////////////            try {
//////////////////////////////                while(true) {
//////////////////////////////                    Thread.sleep(1000);
//////////////////////////////                    seconds++;
//////////////////////////////                }
//////////////////////////////            } catch (InterruptedException e) {
//////////////////////////////                System.out.println(seconds);
//////////////////////////////            }
//////////////////////////////        }
//////////////////////////////    }
//////////////////////////////}
//////////////////////////////
////////////////////////////////public class Solution {
////////////////////////////////    public static void main(String[] args) {
////////////////////////////////        System.out.println("Oh Hi Mark");
////////////////////////////////    }
////////////////////////////////}
