package projects.project1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws IOException {
        // Create a start up
        StartUp startUp = new StartUp();
        GameHelper gameHelper = new GameHelper();
        Boolean stillAlive = true;
        // give it a random location
        Random rn = new Random();
        // i need a random number between 0 and 4
        int start = rn.nextInt(4 + 1);
        ArrayList<Integer> location = new ArrayList<>(Arrays.asList(start, start+1, start+2));
        startUp.setLocation(location);
        while(stillAlive) {
            System.out.println(startUp.getLocation());
            // ask user for a guess
            int userGuess = gameHelper.getUserInput("Please enter your guess: ");
            System.out.println("userGuess: "+userGuess);
            System.out.println(startUp.checkYourself(userGuess));
            // keep asking a user for a guess until the kill
            System.out.println(startUp.getLocation());
        }
        System.out.println("the game has ended");
    }
}
