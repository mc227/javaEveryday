public class Clock extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        clock.start();

        Thread.sleep(5000);
        clock.interrupt();
    }

    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted");
                break;
            }
            System.out.println("Tick");
        }
    }
}