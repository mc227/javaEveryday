/*clarifying my understanding of the super key word
* 030520220757 why do i see super(name) writtien in places
* specifically in task1606*/

// Program to illustrate this keyword
// is used to refer current class
public class RR {
    // instance variable
    //* stopped here 030520220759MC
    // instance variable
    int a = 10;

    // static variable
    static int b = 20;

    void GFG() {
        this.a = 100;
        System.out.println(a);

        this.b = 600;
        System.out.println(b);
        System.out.println("Oh Hi Mark");
        System.out.println(this);
    }

    public static void main(String[] args) {
//        this.a = 700;
        new RR().GFG();
    }
}
