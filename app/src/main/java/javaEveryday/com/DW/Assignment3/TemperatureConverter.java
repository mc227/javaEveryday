package javaEveryday.com.DW.Assignment3;

/**
 * TemperatureConverter class which is a child of Converter
 */
public class TemperatureConverter extends Converter{

    /**
     * Constructors which call parent constructors
     */
    public TemperatureConverter() {
    }

    public TemperatureConverter(Double input) {
        super(input);
    }
    /**
     * Overridden convert() method to convert input (Fahrenheit temperature) to
     * Celsius and returns the value. If the instance has no input value, it should
     * return Double.NaN
     */
    @Override
    public Double convert() {
        if(!getInput().isNaN()){
            return  ((getInput()-32)*5)/9;
        }
        return Double.NaN;
    }
    @Override
    public String toString() {
        return getInput() + " F equals " + convert() + " C";
    }
}
