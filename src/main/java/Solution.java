
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


//public class Solution {
//    private static boolean isCancel;
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread t =  new Thread(new TestThread());
//        t.start();
//        Thread.sleep(3000);
//        outInterrupt();
//    }
//
//    private static void outInterrupt() {
//        isCancel = true;
//    }
//
//    public static class TestThread implements Runnable{
//        public void run() {
//            try {
//                while (!isCancel) {
//                    System.out.println("he-he");
//                    Thread.sleep(500);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}