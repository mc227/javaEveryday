package javaEveryday.com.DW.Assignment2;

import java.util.Scanner;

/**
 * @author: Dereck Watters
 * @date: 11/7/2022
 * This class represents ordering Fruity or salty snacks
 * It has a menu system and asks input from the user.
 */
public class OrderSystem
{
    public static void main(String[] args)
    {
        int number = 0; // initialize choice
        my_switch(number); // apply recursion if choice is neither 1 or 2
    }

    /**
     * This Static method displays the user's choice
     * and applies a recursion in case the user types invalid inputs
     * @param choice
     */
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
                // Perform "1" case.
                System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");// Asks either Fruity or Salty
                // snacks
                int snackChoice = scanner.nextInt();
                System.out.print("What size do you want: S, M, or L: ");// asks the snack size
                String sizeChoice = scanner.next();
                if(snackChoice==1){// if user chooses fruity snack
                    System.out.print("Do you want citrus fruit included? true/false: ");// determine if citrus fruit
                    // or not
                    String citrusString = scanner.next(); // asks for true or false
                    boolean citrusBoolean;
                    if(citrusString.equals("true")) {// turn "true" string into boolean
                        citrusBoolean = true;
                    } else {// turn "false" string into boolean
                        citrusBoolean = false;
                    }
                    Snack fruitSnack = new FruitSnack("ID1",sizeChoice,citrusBoolean);// initialize fruitSnack
                    fruitSnack.setPrice(fruitSnack.totalCost());// calculate totalcost of snack and set price
                    System.out.println("You have chosen " + fruitSnack.toString());// display choice
                } else{// if user chooses salty snack
                    System.out.print("Do you want nut snack included? true/false: ");// determine if nutty snack
                    String nutString = scanner.next();// asks for true or flase
                    boolean nutBoolean;
                    if(nutString.equals("true")){// turn "true" string to boolean
                        nutBoolean = true;
                    } else {// turn "false" string to boolean
                        nutBoolean = false;
                    }
                    Snack saltySnack = new SaltySnack("ID2", sizeChoice,nutBoolean);// initialize salty snack
                    saltySnack.setPrice(saltySnack.totalCost());// calculate totalcost and set price
                    System.out.println("You have chosen " + saltySnack.toString());// display choice
                }
                break;
            case 2:
                // Perform "2" case.
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
