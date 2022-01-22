public class ThreadExample extends Thread {

    @Override
    public void run() {

        System.out.println("Thread started: " + getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + getName() + " is finished.");
    }
}