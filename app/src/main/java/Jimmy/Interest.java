package Jimmy;

public class Interest {
    public static void main(String[] args) {
        /**
         * declare variables
         */
        double principal;
        double rate;
        double interest;

        /**
         * do calculations
         */
        principal = 17000;
        rate = 0.027;
        interest = principal * rate;
        principal = principal + interest;

        /**
         * display results
         */
        System.out.print("THe interest earned is $");
        System.out.println(interest);
        System.out.print("THe total is $");
        System.out.println(principal);


    }
}
