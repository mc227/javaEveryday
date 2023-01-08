package from.scratch;

import java.util.Arrays;

public class SimpleStartup {
    /**
     DECLARE int array called locationCells to hold the location of the startup
     DECLARE int called numOfHits to hold the number of hits and set it equal to 0.
     DECLARE checkYourself method that compares the user's guess to each
     item of the locationCells.
     DECLARE setLocationCells that sets an int array and assigns
     it to the locationCells

     METHOD checkYourself(int guess)
        GET user guess
        LOOP through each item in locationcells int array
            if guess == item
                numOfHits++
                if locationcell.length == numOfHits
                    return kill
                else
                    return hit
            else
                return miss


     METHOD void setLocation(int[] loc)
        set loc to locationCells
     */
    public int[] locationCells;
    public int numOfHits = 0;

    public String checkYourself(int guess) {
        for(int item: locationCells) {
            if(guess == item) {
                numOfHits++;
                if(numOfHits == locationCells.length) {
                    return "kill";
                } else {
                    return "hit";
                }
            }
        }
        return "miss";
    }
    public void setLocation(int[] loc) {
        locationCells = loc;
    }

}
