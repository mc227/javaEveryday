
/*
Airport

*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway(); // 1 runway
    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this){
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if(this.t == null ) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }

    private static void waitForTakeOff() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void takeOff() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while(!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {
                    System.out.println(getName() + " is flying");
                    takeOff();
                    System.out.println(getName() + " in the sky");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {
                    System.out.println(getName() + " is waiting");
                    waitForTakeOff();
                }
            }
        }
    }
}

