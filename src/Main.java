public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();

        t1.start();


 /* The second thread (t2) will start running only after the first thread (t1)
       is finished (or an exception is thrown) */
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        // The main thread will continue running only after t1 and t2 have finished
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished. The program is finished.");

    }
}




//public class Main {
//    public static void main(String[] args) {
//
//        for(int i = 0; i < 10; i++) {
//            MyFirstThread thread = new MyFirstThread();
//            thread.start();
//        }
//    }
//}
//

////public class Main {
////    int x;
////
////    // Constructor with Parameter
////
////    public Main(int x) {
////        this.x = x;
////    }
////
////    public static void main(String[] args) {
////        Main myObj = new Main(5);
////        System.out.println("Value of x = " + myObj.x);
////    }
////}
