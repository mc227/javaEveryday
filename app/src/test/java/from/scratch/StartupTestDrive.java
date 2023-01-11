package from.scratch;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StartupTestDrive {
    public static void main(String[] args) {
        // Instantiate a SimpleStartup object.
        Startup startup = new Startup();
        // Assign it a location (an array list of 3 Integer, like {2, 3, 4}).
        startup.setLocationCells(new ArrayList<>(Arrays.asList(2, 3, 4)));
        // Create an int to represent a user guess (2, 0, etc.).
        int userGuess = 2;
        // Invoke the checkYourself() method passing it the fake user guess.
        String result = startup.checkYourself(userGuess);
        System.out.println(result);
        // Print out the result to see if it’s correct
        if(result.equals("hit")){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
//        assertEquals(result,"hit","passed");

    }

    @Test
    void correctUserGuess() {
        // Instantiate a SimpleStartup object.
        Startup startup = new Startup();
        // Assign it a location (an array of 3 ints, like {2, 3, 4}).
        startup.setLocationCells(new ArrayList<>(Arrays.asList(2, 3, 4)));
        // Create an int to represent a user guess (2, 0, etc.).
        int userGuess = 2;
        // Invoke the checkYourself() method passing it the fake user guess.
        String foo = startup.checkYourself(userGuess);
        System.out.println(foo);
        assertEquals(foo,"hit","passed");
    }

    @Test
    void repeatedTwos() {
        Startup startup = new Startup();
        // Assign it a location (an array of 3 ints, like {2, 3, 4}).
        startup.setLocationCells(new ArrayList<>(Arrays.asList(2, 3, 4)));
        // Create an int to represent a user guess (2, 0, etc.).
        int firstGuess = 2;
        // Invoke the checkYourself() method passing it the fake user guess.
        String foo = startup.checkYourself(firstGuess);
        System.out.println(foo);
        assertEquals(foo,"hit","passed");
    }
}
