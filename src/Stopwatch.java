public class Stopwatch extends Thread{
    private int seconds;

    public void run() {
        try {
            while(true) {
                Thread.sleep(1000);
                seconds++;
            }
        } catch (InterruptedException e) {
            System.out.println("here");
            System.out.println(seconds);
        }
    }
}
