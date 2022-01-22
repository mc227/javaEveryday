public class MyFirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("I'm Thread! My Name is " + getName());
    }
}
