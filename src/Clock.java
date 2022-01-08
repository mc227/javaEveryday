public class Clock implements Runnable {

    @Override
    public void run() {

        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("Tick");

                if (!ClockManager.isClockRun) {return;}
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

//public class Clock  implements Runnable{
//
//    @Override
//    public void run() {
//        Thread current = Thread.currentThread();
//
//        while (!current.isInterrupted()) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("Tick");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Clock clock = new Clock();
//        Thread clockThread = new Thread(clock);
//        clockThread.start();
//        Thread.sleep(10000);
//        clockThread.interrupt();
//    }
//}
//
//
