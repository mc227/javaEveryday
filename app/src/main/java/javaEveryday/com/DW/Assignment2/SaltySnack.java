package javaEveryday.com.DW.Assignment2;


import java.text.DecimalFormat;

/**
 * @author: Dereck Watters
 * @date: 11/7/2022
 * This class represents a Salty Snack.
 * It is a child class of the Snack class
 */
public class SaltySnack extends Snack{
    /**
     * A boolean variable indication if a snack is a nut Snack
     */
    private Boolean nutSnack;

    /**
     * This variable ensures the number always rounds to 2 decimal places.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * This constructor initializes the saltySnack with the following parameters
     * @param id
     * @param size
     * @param nutSnack
     */
    public SaltySnack(String id, String size, Boolean nutSnack) {
        super(id, size);
        this.nutSnack = nutSnack;
    }

    /**
     * This method overrides the totalCost method and
     * adds $4.59 to the total cost if getCitrusFruit is true
     * @return cost amount in double
     */

    @Override
    public double totalCost() {
        if(nutSnack){
            return 4.50 + super.totalCost();
        }
        return super.totalCost();
    }

    /**
     * This method overrides the parent's toString method
     * @return String with type of snack, size of snack, snack ID and snack price
     */
    @Override
    public String toString() {
        return "snack type = Salty Snack, " +
                "of type = " + getSize() +
                ", id = "+ getId() +
                " and price = " + df.format(getPrice());
    }
}
