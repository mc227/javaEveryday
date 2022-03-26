public class Solution {
    public static void main(String[] args) throws InterruptedException{
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("Oh Hi Mark");
        }
    }
}