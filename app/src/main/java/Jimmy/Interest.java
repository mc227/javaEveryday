package Jimmy;

/**
 * This class calculates the interest and total amounts
 */
public class Interest {
    public static void main(String[] args) {
        // here are my attributes
        double principal;
        double interest;
        double amount;

        principal = 17000;
        interest = 0.027;
        amount = principal * interest; // this is where the interest in dollars is calculated
        principal = principal + amount; // this is the total amount at the end of the year
        System.out.print("The interest earned is $");
        System.out.println(amount);
        System.out.print("The total at the end of the year is $");
        System.out.println(principal);



    }
}
