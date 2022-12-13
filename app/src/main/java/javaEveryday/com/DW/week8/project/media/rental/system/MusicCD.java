package javaEveryday.com.DW.week8.project.media.rental.system;

import java.util.Calendar;
public class MusicCD extends Media {
    // local attributes
    private int length;
    // constructor
    public MusicCD(int id, String title, int year, boolean available, int length) {
        super(id, title, year, available);
        this.length = length;
    }

    public MusicCD(String line) {
        super(line);
        length = Integer.parseInt(line.substring(line.indexOf(", length=")+9,line.indexOf(" min")));
    }

    // get method
    public int getLength() {
        return length;
    }
    // set method
    public void setLength(int length) {
        this.length = length;
    }
    // override parent's
    @Override
    public double calculateRentalFee() {
        double fee = length * 0.02; // basic fee
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if (this.getYear() == currYear)
            fee += 1; // add $1.00 fee
        return fee;
    }
    @Override
    public String toString() {
        return "MusicCD [ id=" + getId() + ", title=" + getTitle() + ", year="
                + getYear() + ", length=" + length + " min"+ " available="+isAvailable()+
                "]";
    }
}