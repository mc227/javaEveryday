package projects.project1;

import java.util.ArrayList;

public class StartUp {
    ArrayList<Integer> location;

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public ArrayList<Integer> getLocation() {
        return location;
    }

    public String checkYourself(Integer guess) {
        String result = "miss";
        Integer index = location.indexOf(guess);
        if(index >=0) {
            location.remove(index);
            if (location.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
