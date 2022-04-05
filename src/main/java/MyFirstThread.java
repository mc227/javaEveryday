public class MyFirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is "+getName());
    }

    public static void main(String[] args) {
//        MyFirstThread myFirstThread = new MyFirstThread();
//        myFirstThread.start();
        for(int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }

    }
}
