package javaEveryday.com.Head.First.Third.Edition;

public class Foo {
    public void go(){
        int x = 0;
        int z = x + 3;
    }

    public static void main(String[] args) {
        Foo a = new Foo();
        Foo b = new Foo();
        Foo c = a;
        if (a == b) {
            System.out.println("false daw");
        } // false
        if (a == c) {
            System.out.println("here");
        } // true
        if (b == c) { } // false
    }
}
