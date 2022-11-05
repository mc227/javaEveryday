package javaEveryday.com.DW.Assignment2;


import java.text.DecimalFormat;

/**
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

    public SaltySnack(String id, String size, Boolean nutSnack) {
        super(id, size);
        this.nutSnack = nutSnack;
    }

    @Override
    public double totalCost() {
        if(nutSnack){
            return 4.50 + super.totalCost();
        }
        return super.totalCost();
    }
    @Override
    public String toString() {
        return "snack type = Salty Snack, " +
                "of type = " + getSize() +
                ", id = "+ getId() +
                " and price = " + df.format(getPrice());
    }

//    public static void main(String[] args) {
//        SaltySnack saltySnack = new SaltySnack("id2", "S",true);
//        saltySnack.setPrice(saltySnack.totalCost());
//        System.out.println(saltySnack.toString());
//    }
}
