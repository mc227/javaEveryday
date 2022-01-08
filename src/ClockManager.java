class ClockManager
{
    public static boolean isClockRun = true;
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
//        System.out.println(Thread.currentThread().getName());
        Thread.sleep(10000);
        isClockRun = false;
    }

}