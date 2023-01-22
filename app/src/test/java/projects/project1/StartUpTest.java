package projects.project1;

import from.scratch.hfj3e.ch6.Startup;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StartUpTest {
    @Test
    void firstTest() {
        // initialize StartUp object
        StartUp startUp = new StartUp();
        // give startUp a location
        ArrayList<Integer> location = new ArrayList<Integer>(
                Arrays.asList(0,1,2));
        startUp.setLocation(location);
        // get user input
        Integer userGuess = 3;
        // check if user input is correct
        System.out.println(startUp.checkYourself(userGuess));
        // check if location is removed
        System.out.println(startUp.checkYourself(0));
        System.out.println(startUp.checkYourself(0));
        System.out.println(startUp.getLocation());
    }
}