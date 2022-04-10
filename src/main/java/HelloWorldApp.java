import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class HelloWorldApp {
    public static void main(String []args) {
        Object object = new Object();
        synchronized(object) {
            System.out.println("Hello World");
        }
    }
}

