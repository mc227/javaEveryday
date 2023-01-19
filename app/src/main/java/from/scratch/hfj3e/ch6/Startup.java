package from.scratch.hfj3e.ch6;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String guess) {
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
