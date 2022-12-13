package javaEveryday.com.DW.week8.project.media.rental.system;

/*
 * The class is declared abstract as it represents a generic media
 */
public abstract class Media {
    // Member variables
    private int id;
    private String title;
    private int year; // validate that 4 digits
    private boolean available; // true if available otherwise it's considered unavailable (i.e. rented)

    // constructor with all the attribute values
    public Media(int id, String title, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = available;
    }

    // constructor to parse string for its values
    public Media(String line) {
        id = Integer.parseInt(line.substring(line.indexOf("[ id=")+5,line.indexOf(", title=")));
        title = line.substring(line.indexOf(", title=")+8,line.indexOf(", year="));
        if(line.contains("EBook"))
            year = Integer.parseInt(line.substring(line.indexOf(", year=")+7,line.indexOf(", chapters=")));
        if(line.contains("MusicCD"))
            year = Integer.parseInt(line.substring(line.indexOf(", year=")+7,line.indexOf(", length=")));
        if(line.contains("MovieDVD"))
            year = Integer.parseInt(line.substring(line.indexOf(", year=")+7,line.indexOf(", size=")));
        available = Boolean.parseBoolean(line.substring(line.indexOf(" available=")+11,line.indexOf("]")));
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Media(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
    // get methods
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    // change title
    public void setTitle(String title) {
        this.title = title;
    }
    // change year published
    public void setYear(int year) {
        this.year = year;
    }
    // calculate rental fee; for generic media it is flat fee $3.50
    public double calculateRentalFee() {
        return 3.50;
    }
}