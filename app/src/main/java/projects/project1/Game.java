package projects.project1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws IOException {
        StartUp startUp = new StartUp();
        GameHelper gameHelper = new GameHelper();
        Random rn = new Random();
        int start = rn.nextInt(4 + 1);
        ArrayList<Integer> location = new ArrayList<>(Arrays.asList(start, start+1, start+2));
        startUp.setLocation(location);
        while(!startUp.getLocation().isEmpty()) {
            int userGuess = gameHelper.getUserInput("Please enter your guess: ");
            System.out.println(startUp.checkYourself(userGuess));
        }
        System.out.println("the game has ended");
    }
}
