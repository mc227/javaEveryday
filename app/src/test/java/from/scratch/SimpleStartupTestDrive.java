package from.scratch;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleStartupTestDrive {
    /**
     * [x] Instantiate a SimpleStartup object.
     *
     * [x] Assign it a location (an array of 3 ints, like {2, 3, 4}).
     *
     * Create an int to represent a user guess (2, 0, etc.).
     *
     * Invoke the checkYourself() method passing it the fake user guess.
     *
     * Print out the result to see if it’s correct
     */
    public static void main(String[] args) {
        // Instantiate a SimpleStartup object.
        SimpleStartup simpleStartup = new SimpleStartup();
        // Assign it a location (an array of 3 ints, like {2, 3, 4}).
        simpleStartup.setLocation(new int[]{2, 3, 4});
        // Create an int to represent a user guess (2, 0, etc.).
        int userGuess = 2;
        // Invoke the checkYourself() method passing it the fake user guess.
        String foo = simpleStartup.checkYourself(userGuess);
        System.out.println(foo);
        // Print out the result to see if it’s correct
        if(foo.equals("hit")){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
}
