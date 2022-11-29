package javaEveryday.com.DW.Assignment3;

/**
 * DistanceConverter class which is a child of Converter
 */
public class DistanceConverter extends Converter{
    /**
     * Constructors which call parent constructors
     */
    public DistanceConverter() {
    }

    public DistanceConverter(Double input) {
        super(input);
    }

    /** Overridden convert() method to convert input (distance in miles) to distance in
     kilometers and returns the value. If the instance has no input value, it should
     return Double.NaN
     */
    @Override
    public Double convert() {
        if(!getInput().isNaN()){
            return getInput() * 1.609;
        }
        return Double.NaN;
    }
    @Override
    public String toString() {
        return getInput() + " Miles equals " + convert() + " Kilometers";
    }
}
