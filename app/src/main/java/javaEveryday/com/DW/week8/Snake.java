package javaEveryday.com.DW.week8;

public class Snake extends Pet {

    // attributes
    private double length; // in feet

    // constructor
    public Snake(String name, int id, double length) {
        super(name, id);
        this.length = length;
    }

    // constructor to parse string with xml tags for its values
    public Snake(String line) {
        super(line);
        length = Float.parseFloat(line.substring(line.indexOf("<length>") + 8, line.indexOf("</length>")));
    }

    // get methods
    public double getLength() {
        return length;
    }

    // set methods
    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "<Snake>"
                + "<name>" + this.getName() + "</name>"
                + "<id>" + this.getID() + "</id>"
                + "<length>" + length + "</length>"
                + "</Snake>";
    }
}