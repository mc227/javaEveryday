public class HelloWorldApp {
    public static void main(String[] args) {
//        System.out.println("oh Hai, " + args[0]);
//        while(true) {
//            // Do nothing
//        }
//        Thread currentThread = Thread.currentThread();
//        ThreadGroup threadGroup = currentThread.getThreadGroup();
//        System.out.println("Thread: " + currentThread.getName());
//        System.out.println("Thread Group: " + threadGroup.getName());
//        System.out.println("Parent Group: " + threadGroup.getParent().getName());
        Thread th = Thread.currentThread();
        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        });
        System.out.println(2/0);
    }
}
