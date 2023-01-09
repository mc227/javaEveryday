package from.scratch;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleStartupGame {
    /**
     PREP CODE
     public static void main(String[] args) {
        DECLARE an int variable to hold the number of user guesses, named numOfGuesses and set it to 0.
        MAKE the single SimpleStartup object.
        COMPUTE a random number between 0 and 4 that will be the starting location cell position
        CREATE a three item int array with the starting random number plus 1 and plus 2 to complete the three
        MAKE a location for the startup object using random number generated and the other 2 numbers
        CREATE a boolean isAlive
        // Repeat until the Startup is sunk.
        WHILE the Startup is still alive:
            ASK the user for a guess.
            incremetnt numOfguess
            GET user input from the command line
            CHECK the guess.
            SET isAlive to false once start up is killed
        Tell the user how many guesses it took.
     }
     */
    public static void main(String[] args) throws IOException {
        int numOfGuesses = 0;
        SimpleStartup simpleStartup = new SimpleStartup();
        int start = 0 + (int)(Math.random() * ((4 - 0) + 1)); // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        int[] location = {start, start+1,start+2};
        simpleStartup.setLocation(location);
        boolean isAlive = true;
        while (isAlive){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("enter a number: ");
            int userGuess = Integer.parseInt(bufferedReader.readLine());
            numOfGuesses++;
            String result = simpleStartup.checkYourself(userGuess);
            System.out.println(result);
            if(result.equals("kill")){
                isAlive = false;
            }
        }
        System.out.println("you took "+ numOfGuesses + " guesses");
    }
}
