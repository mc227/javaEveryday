package javaEveryday.com.DW;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.idle();

        Car toyota = new Toyota();
        polyMethod(toyota);
    }
    public static void polyMethod(Object obj) {
        System.out.println(obj.toString());
    }
}