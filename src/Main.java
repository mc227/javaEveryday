public class Main {
    int x;

    // Constructor with Parameter

    public Main(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
