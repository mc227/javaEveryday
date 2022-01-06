public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point myObj = new Point(5, 10);
        System.out.println("value of x = " + myObj.x);
        System.out.println("value of y = " + myObj.y);
    }
}
