package from.scratch;

import java.util.ArrayList;

public class Startup {
    private ArrayList<Integer> locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<Integer> locs) {
        locationCells = locs;
    }

    public String checkYourself(Integer guess) {
        String result = "miss";
        for (Integer cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                locationCells.remove(cell);
                numOfHits++;
                break;
            } // end if
        } // end for
        if (locationCells.size() == 0) {
            result = "kill";
        } // end if
//        System.out.println(result);
        return result;
    } // end method
} // close class
