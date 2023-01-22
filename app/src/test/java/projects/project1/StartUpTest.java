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
        // get user input and check
        System.out.println(startUp.checkYourself(0));
        System.out.println(startUp.checkYourself(1));
        System.out.println(startUp.checkYourself(2));
    }

    @Test
    void secondTest() {
        // initialize StartUp object
        StartUp startUp = new StartUp();
        // give startUp a location
        ArrayList<Integer> location = new ArrayList<Integer>(
                Arrays.asList(3,4,5));
        startUp.setLocation(location);
        // get user input and check
//        System.out.println(startUp.checkYourself(3));
        assertEquals(startUp.checkYourself(3),"hit");
//        System.out.println(startUp.checkYourself(4));
        assertEquals(startUp.checkYourself(4),"hit");
//        System.out.println(startUp.checkYourself(5));
        assertEquals(startUp.checkYourself(5),"kill");
    }
}