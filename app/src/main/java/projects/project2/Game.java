package projects.project2;

import java.util.ArrayList;

public class Game {
    private GameHelper helper = new GameHelper();
    private ArrayList<StartUp> startups = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // create three startups (cabista, poniez, hacqi) instead of one.
        StartUp first = new StartUp();
        StartUp second = new StartUp();
        StartUp third = new StartUp();
        startups.add(first);
        startups.add(second);
        startups.add(third);
        // Give each of the three Startups a name.
        first.setName("cabista");
        second.setName("poniez");
        third.setName("hacqi");
        // Put the Startups on a grid rather than just a single row, and do it for all three Startups.
        first.setLocation(helper.placeStartup(3));
        second.setLocation(helper.placeStartup(3));
        third.setLocation(helper.placeStartup(3));

        System.out.println("Welcome to StartUp Bust");
        System.out.println("Your goal is to sink three startups");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");
    }

    private void startPlaying() {
        while(!startups.isEmpty()){
            String guess = helper.getUserInput("please enter your guess");
            checkUserGuess(guess);
        }
    }

    public void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (StartUp startUp:startups) {
            result = startUp.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")) {
                startups.remove(startUp);
                break;
            }
        }
        System.out.println(result);
        System.out.println("Number of Guesses: " + numOfGuesses);
        for(StartUp startUp: startups) {
            System.out.println(startUp.getName() + " still alive");
        }
    }

    public void finishGame() {
        System.out.println("GAME OVER");
        System.out.println("Total Number of Guesses: "+numOfGuesses);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}
