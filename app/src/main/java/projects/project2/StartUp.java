package projects.project2;

import java.util.ArrayList;

public class StartUp {
    String name;
    ArrayList<String> location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public String checkYourself(String guess) {
        String result = "miss";
        int index = location.indexOf(guess);
        if(index >= 0) {
            location.remove(index);
            if (location.size() == 0){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
