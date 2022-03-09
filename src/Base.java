public class Base extends Parent{
    void rr() {
        System.out.println(super.a);
        System.out.println(super.b);
    }

    public static void main(String[] args) {
        new Base().rr();
    }
}
