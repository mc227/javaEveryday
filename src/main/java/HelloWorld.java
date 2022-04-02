public class HelloWorld{
    public static void main(String []args){
        Object object = new Object();
        synchronized(object) {
            System.out.println("There's no easy way out");
            System.out.println("There's shortcut home");
        }
    }
}