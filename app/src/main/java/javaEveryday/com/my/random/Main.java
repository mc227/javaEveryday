package javaEveryday.com.my.random;

public class Main {
    public static void main(String[] args) {

        int number=18970;

        int one=(number/1);
        int ones=(number/1)%10;
        int tens=(number/10)%10;
        int hundred=(number/100)%10;
        int thousand=(number/1000)%10;
        int tenThousand=(number/10000)%10;
        double result = (number/10)%10;

        System.out.println("Ones: " + ones + " Tens: "+ tens + " Hundred: "+ hundred + " Thousand: " + thousand +" Ten Thousand:  " +  tenThousand);
    }
}
