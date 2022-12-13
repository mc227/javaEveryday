package javaEveryday.com.DW.week8.project.media.rental.system;

import java.util.Calendar;

/**
 * Model EBook object which is a child of Media
 */
public class EBook extends Media {
    // inherits from parent plus attribute for number of
    //chapters
    private int numChapters;

    // constructor
    public EBook(int id, String title, int year, boolean available, int numChapters) {
        super(id, title, year, available);
        this.numChapters = numChapters;
    }

    public EBook(String line) {
        super(line);
        numChapters = Integer.parseInt(line.substring(line.indexOf(", chapters=")+11,line.indexOf(" available=")));
    }

    // get method
    public int getNumChapters() {
        return numChapters;
    }
    // set method
    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }
    // override parent's
    // The rental fee for EBook is the number of chapters * 0.10 + $1 if EBook was
    //published this year
    @Override
    public double calculateRentalFee() {
        double fee = numChapters * 0.10; // basic fee
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if (this.getYear() == currYear)
            fee += 1; // add $1.00 fee
        return fee;
    }
    // display values to the console
    @Override
    public String toString() {
        return "EBook [ id=" + getId() + ", title=" + getTitle()
                + ", year=" + getYear() + ", chapters=" + numChapters + " available="+isAvailable()+
                "]";
    }
}