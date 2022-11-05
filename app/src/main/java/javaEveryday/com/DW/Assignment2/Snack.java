package javaEveryday.com.DW.Assignment2;

import java.math.BigDecimal;

/**
 * The Snack class represents the base class of snacks
 * and will the parent class of the FruitSnack and SaltySnack
 * */
public class Snack
{
    /**
     * A String of (combination of numbers and letters) representing Snack ID
     */
    private String id;
    /**
     * A String representing Snack size. It assumes Small (S), Medium (M) and Large (L) as values.
     */
    private String size;
    /**
     * A double to keep track of the price of the snac
     */
    private double price;

    /**
     * constructor to initialize ID and size
     * @param id Snack ID
     * @param size Snack Size (S,M or L)
     */
    public Snack(String id, String size) {
        this.id = id;
        this.size = size;
    }

    /**
     * This methods gets the Snack ID
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This method sets the snack ID value
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method gets the Size of the Snack
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * This methods sets the size of the Snack
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * This method gets the Price of the Snack
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * This method sets the price of the snack
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method calculates the totalCost of the Snack, which will be assigned to the
     * price of the snack
     * @return totalCost in double precision
     */
    public double totalCost(){
        if(this.getSize().equals("S")){
            return 19.99;
        } else if(this.getSize().equals("M")){
            return 29.99;
        } else {
            return 39.99;
        }
    }

} // end class Snack
