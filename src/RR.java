// Java program to illustrate
// the usage of this keyword

class RR {
    int first = 22;
    int second = 33;

    void garcia(int a, int b)
    {
        a = this.first;
        b = this.second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(a);
        System.out.println(b);
    }

    void louis(int m, int n)
    {
        this.first = m;
        this.second = n;
        System.out.println(first);
        System.out.println(second);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        new RR().garcia(100, 200);
        new RR().louis(1, 2);
    }
}


///*clarifying my understanding of the super key word
//* 030520220757 why do i see super(name) writtien in places
//* specifically in task1606*/
//
//// Program to illustrate this keyword
//// is used to refer current class
//public class RR {
//    // instance variable
//    //* stopped here 030520220759MC
//    // instance variable
//    int a = 10;
//
//    // static variable
//    static int b = 20;
//
//    void GFG() {
//        this.a = 100;
//        System.out.println(a);
//
//        this.b = 600;
//        System.out.println(b);
//        System.out.println("Oh Hi Mark");
//        System.out.println(this);
//    }
//
//    public static void main(String[] args) {
////        this.a = 700;
//        new RR().GFG();
//    }
//}
