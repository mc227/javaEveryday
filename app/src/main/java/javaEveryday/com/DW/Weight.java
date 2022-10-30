package javaEveryday.com.DW;
/**
 * A weight class that uses pounds and ounces
 *
 *
 * @version 1.0
 * @author
 */
public class Weight {
    private static final int OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    public int getPounds() {
        return pounds;
    }

    public double getOunces() {
        return ounces;
    }

    /**
     * public parameterized constructor
     *
     * @param pounds     The number of pounds (positive number)
     * @param ounces     The number of ounces (positive number)
     */
    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
        normalize();
    }

    /**
     * Get the value of the Weight in ounces.
     * convert this.pounds to ounces and add it to this.ounces
     * @return The total Weight in ounces
     * */
    private double toOunces(){
        double totalOunces;
        totalOunces = pounds * OUNCES_IN_A_POUND + ounces;
        return totalOunces;
    }

    /**
     * Ensures that the ounces is less than 16
     * */
    private void normalize(){
        if(this.ounces >= 16) {
            this.pounds = this.pounds + (int) Math.floor(this.ounces / 16);
            this.ounces = this.ounces % 16;
        }
    }

    /**
     * Determines if the object is greater or less than
     * the initialized values in the constructor.
     * @returns true if object is less than the initialized values
     * */
    public boolean lessThan (Weight weight){
        // implementation
        int weightInOz;
        int thisWeightInOz;
        thisWeightInOz = (int) this.toOunces();
        weightInOz = (int) weight.toOunces();
        return (thisWeightInOz < weightInOz);
    }

    @Override
    public String toString() {
        return pounds + " pound(s) "+ ounces + " ounce(s)";
    }

    /**
     * This method should
     * accept a Weight object as a parameter
     * and add the object’s weight values to the initialized
     * values.
     * */
    public void addTo (Weight weight){
        // implementation
        this.ounces = this.ounces + weight.ounces;
        this.pounds = this.pounds + weight.pounds;
        normalize();
    }
//    public static void main(String[] args) {
//        Weight weight = new Weight(7,17);
//        System.out.println(weight.toString());
//    }
}
