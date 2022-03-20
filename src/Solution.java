
import java.util.ArrayList;
import java.util.List;

/* 
Countdown

*/

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for(int i = 0; i < 5; i++) {
            list.add("Line " + i);
        }
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void printCountdown() throws InterruptedException {
            Thread.sleep(500);
            countFrom--;
            System.out.println(list.get(countFrom));
        }

        @Override
        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Countdown(4), "Oh Hi Mark");
        System.out.println(t.getName());
        t.start();
    }
}
