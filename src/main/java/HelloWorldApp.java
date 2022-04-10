import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

class HelloWorldApp {
    public static void main(String []args) {
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

