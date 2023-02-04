package projects.project2;

import java.util.ArrayList;

public class Game {
    public void setUpGame() {

    }

    public void startPlaying() {

    }

    public void checkUserGuess() {

    }

    public void finishGame() {

    }
    public static void main(String[] args) {
        // create three startups (cabista, poniez, hacqi) instead of one.
        GameHelper helper = new GameHelper();
        ArrayList<StartUp> startups = new ArrayList<>();
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

        int numOfGuesses = 0;
        while(!startups.isEmpty()){
            String result = "miss";
            String guess = helper.getUserInput("please enter your guess");
            for(int i = 0; i < startups.size(); i++) {
                System.out.println(startups.get(i).name);
                result = startups.get(i).checkYourself(guess);
                System.out.println(startups.get(i).getLocation());
                System.out.println(result);
                if(result == "kill") {
                    startups.remove(i);
                }
            }
            numOfGuesses++;
            System.out.println("Number of Guesses: " + numOfGuesses);
        }
        System.out.println("GAME OVER");
        System.out.println("Total Number of Guesses: "+numOfGuesses);
    }
}
