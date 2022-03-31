public class HelloWorldApp {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                int secToWait = 60;
                Thread.sleep(secToWait* 1000);
                System.out.println("Woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
