package javaEveryday.com.DW.Assignment3;

/**
 * Parent Converter Class which will be inherited
 */
public class Converter {
    private Double input;

    /**
     * Default constructor with no parameter which sets input to Double.NaN
     */
    public Converter() {
        this.input = Double.NaN;
    }
    /**
     * Overloaded constructor with input for parameter
     */
    public Converter(Double data) {
        this.input = data;
    }
    /**
     * Get and set methods for input attribute
     */
    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }
    /**
     * Method convert() which returns input value
     */
    public Double convert(){
        return input;
    }
}
