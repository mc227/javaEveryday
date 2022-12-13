package javaEveryday.com.DW.week8;

public class Dog extends Pet {

    // attributes
    private String chipID;

    // constructor
    public Dog(String name, int id, String chipID) {
        super(name, id);
        this.chipID = chipID;
    }

    public Dog(String line) {
        super(line);
        chipID  = line.substring(line.indexOf("<chipID>") + 8, line.indexOf("</chipID>"));
    }

    // get methods
    public String getChipID() {
        return chipID;
    }

    // set methods
    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    public String toString() {
        return "<Dog>"
                + "<name>" + this.getName() + "</name>"
                + "<id>" + this.getID() + "</id>"
                + "<chipID>" + chipID + "</chipID>"
                + "</Dog>";
    }
}