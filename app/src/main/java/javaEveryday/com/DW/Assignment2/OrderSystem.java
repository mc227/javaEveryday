package javaEveryday.com.DW.Assignment2;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        int number = 0; // initialize choice
        my_switch(number); // apply recursion if choice is neither 1 or 2
    }

    public static void my_switch(int choice){
        System.out.println();
        System.out.println("MENU");
        System.out.println("1: Order a Snack");
        System.out.println("2: Exit program");
        System.out.print("Enter your selection: ");
        Scanner scanner = new Scanner(System.in); // // create Scanner to obtain input from command window
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Perform "original number" case.
                System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");
                int snackChoice = scanner.nextInt();
                System.out.print("What size do you want: S, M, or L: ");
                String sizeChoice = scanner.next();
                if(snackChoice==1){
                    System.out.print("Do you want citrus fruit included? true/false: ");
                    String citrusString = scanner.next();
                    boolean citrusBoolean;
                    if(citrusString.equals("true")) {
                        citrusBoolean = true;
                    } else {
                        citrusBoolean = false;
                    }
                    FruitSnack fruitSnack = new FruitSnack("ID1",sizeChoice,citrusBoolean);
                    fruitSnack.setPrice(fruitSnack.totalCost());
                    System.out.println("You have chosen " + fruitSnack.toString());
                } else{
                    System.out.print("Do you want nut snack included? true/false: ");
                    String nutString = scanner.next();
                    boolean nutBoolean;
                    if(nutString.equals("true")){
                        nutBoolean = true;
                    } else {
                        nutBoolean = false;
                    }
                    SaltySnack saltySnack = new SaltySnack("ID2", sizeChoice,nutBoolean);
                    saltySnack.setPrice(saltySnack.totalCost());
                    System.out.println("You have chosen " + saltySnack.toString());
                }
                break;
            case 2:
                // Perform "encrypt number" case.
                System.out.println("Thank you for using the program. Goodbye!");
                break;
            default:
                // The user input an unexpected choice.
                System.out.println();
                System.out.println("Please Enter 1 or 2.");
                my_switch(choice);
        }
        System.out.println();
    }
}
