package from.scratch;

import java.util.Arrays;

public class SimpleStartup {
    /**
     DECLARE int array to represent the location of the cells. Call it locationCells
     DECLARE int to represent the number of accurate hits. Call it numOfHits
     DECLARE checkYourself function that takes in int as an input parameter.
     DECLARE setLocation function that takes in int array as an input parameter

     METHOD checkYourself(int guess)
        GET user's guess
        LOOP through the array
            if user guess == current item in the array
                numOfHits++
                if numOfHits == length(array)
                    return kill
                else
                    return hit
            else
                return miss

     METHOD setLocation(int[] loc)

     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
    }
}
