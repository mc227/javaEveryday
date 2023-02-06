package HFJ3e.Chapter7;

public class C extends B{
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }

    public static void main(String[] args) {
        C c = new C();
        c.m3();
    }
}
