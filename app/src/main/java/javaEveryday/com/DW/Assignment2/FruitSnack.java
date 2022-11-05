package javaEveryday.com.DW.Assignment2;


import java.text.DecimalFormat;

/**
 * This class represents a Fruit Snack.
 * It is a child class of the Snack class
 */
public class FruitSnack extends Snack{
    /**
     * A boolean variable indicating if a snack is a citrus fruit
     */
    private Boolean citrusFruit;


    /**
     * This variable ensures the number always rounds to 2 decimal places.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * This method indicates whether citrusFruit is true or false
     * @return true or false
     */
    public Boolean getCitrusFruit() {
        return citrusFruit;
    }

    /**
     * This method sets citrusFruit as true or false
     * @param citrusFruit
     */
    public void setCitrusFruit(Boolean citrusFruit) {
        this.citrusFruit = citrusFruit;
    }


    /**
     * This constructor initializes the fruitsnack with the following parameters
     * @param id
     * @param size
     * @param citrusFruit
     */
    public FruitSnack(String id, String size, Boolean citrusFruit) {
        super(id, size);
        this.citrusFruit = citrusFruit;
    }

    /**
     * This method overrides the totalCost method and
     * adds $5.99 to the total cost if getCitrusFruit is true
     * @return
     */
    @Override
    public double totalCost() {
        if(this.getCitrusFruit()==true){
            System.out.println("here");
            return 5.99 + super.totalCost();
        }
        return super.totalCost();
    }

    /**
     * This method overrides the parent's toString method
     * @return String with type of snack, size of snack, snack ID and snack price
     */
    @Override
    public String toString() {
        return "snack type = Fruit Snack, " +
                "of type = " + getSize() +
                ", id = "+ getId() +
                " and price = " + df.format(getPrice());
    }

}
