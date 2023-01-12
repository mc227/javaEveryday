package from.scratch.hfj3e.ch6;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        numOfHits++;
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    } // end method
}
