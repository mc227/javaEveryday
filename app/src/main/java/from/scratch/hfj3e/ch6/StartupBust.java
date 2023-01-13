package from.scratch.hfj3e.ch6;

import java.util.ArrayList;

public class StartupBust {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        ArrayList<Startup> startups = new ArrayList<>();

        Startup one = new Startup();
        startups.add(one);
        one.setName("cabista");
        Startup two = new Startup();
        two.setName("poniez");
        startups.add(two);
        Startup three = new Startup();
        three.setName("hacqi");
        startups.add(three);
        // Put the Startups on a grid rather
        // than just a single row, and do it
        // for all three Startups.
        for(Startup startup: startups){
            System.out.println(startup.getName());
            startup.setLocationCells(helper.placeStartup(3));
            startup.getLocationCells();
        }

        //Check each user guess with
        // all three Startups, instead of just one.

        // Keep playing the game  until there are no more live Startups.

        // Get out of main.


    }
}
