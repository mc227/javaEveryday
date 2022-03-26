
/*
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 3;
//    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //write your code here
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //write your code here
            if (numSeconds < 3.5) {
                while(numSeconds >=0) {
                    try {
                        Thread.sleep(1000);
                        if(numSeconds ==0) {
                            System.out.print("Go!");
                        } else {
                            System.out.print(numSeconds+" ");
                        }
                        numSeconds--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                while(numSeconds >=0) {
                    try {
                        Thread.sleep(1000);
                        if(numSeconds ==0) {
                            System.out.print("Interrupted!");
                        } else {
                            System.out.print(numSeconds+" ");
                        }
                        numSeconds--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
