public class Clock extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        clock.start();

        Thread.sleep(10000);
        clock.interrupt();
    }

    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted");
                break;
            }
            System.out.println("Oh Hi Mark");
        }
    }
}



//
//public class Clock implements Runnable {
//
//    public void run() {
//        try {
//            Thread current =  Thread.currentThread();
//            while(!current.isInterrupted()){
//             Thread.sleep(1000);
//                System.out.println("Tick");
//            }
//        } catch (InterruptedException e) {}
//    }
//}



//public class Clock implements Runnable {
//
//    @Override
//    public void run() {
//
//        try {
//            while (true) {
//                Thread.sleep(1000);
//                System.out.println("Tick");
//
//                if (!ClockManager.isClockRun) {return;}
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
//
////public class Clock  implements Runnable{
////
////    @Override
////    public void run() {
////        Thread current = Thread.currentThread();
////
////        while (!current.isInterrupted()) {
////            try {
////                Thread.sleep(1000);
////                System.out.println("Tick");
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////
////        }
////    }
////
////    public static void main(String[] args) throws InterruptedException {
////        Clock clock = new Clock();
////        Thread clockThread = new Thread(clock);
////        clockThread.start();
////        Thread.sleep(10000);
////        clockThread.interrupt();
////    }
////}
////
////
