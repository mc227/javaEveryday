package projects.project2;

import java.util.ArrayList;

public class Game {
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
        /**
         * delete below when shipping to production
         */
        System.out.println(first.getLocation());
        System.out.println(second.getLocation());
        System.out.println(third.getLocation());
        /***/
        // i need to keep asking guesses until
//        String guess = helper.getUserInput("please enter your guess");
        /**
         * Check each user guess with all three Startups, instead of just one.
         */
    }
}
