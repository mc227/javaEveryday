package javaEveryday.com.DW.week8;

public abstract class Pet {

    // attributes
    private int id;
    private String name;

    // constructor
    public Pet(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // constructor to parse string with xml tags for its values
    public Pet(String line) {
        id = Integer.parseInt(line.substring(line.indexOf("<id>") + 4, line.indexOf("</id>")));
        name = line.substring(line.indexOf("<name>") + 6, line.indexOf("</name>"));
    }

    // get method
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    // set methods
    public void setName(String name) {
        this.name = name;
    }
}