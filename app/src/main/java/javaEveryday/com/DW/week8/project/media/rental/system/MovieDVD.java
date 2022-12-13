package javaEveryday.com.DW.week8.project.media.rental.system;

/**
 * MovieDVD object which is a child of Media
 */
public class MovieDVD extends Media {
    // local attributes
    private double size; // value in MB

    // constructor
    public MovieDVD(int id, String title, int year, boolean available, double size) {
        super(id, title, year, available);
        this.size = size;
    }

    public MovieDVD(String line) {
        super(line);
        size = Double.parseDouble(line.substring(line.indexOf(", size=")+7,line.indexOf(" MB")));
    }

    // get method
    public double getSize() {
        return size;
    }

    // set method
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MovieDVD [ id=" + getId() + ", title=" + getTitle() + ", year="
                + getYear() + ", size=" + size + " MB"+ " available="+isAvailable()+
                "]";
    }
}
