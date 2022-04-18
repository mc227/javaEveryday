import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleCalculatorTest  {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threePlusSevenShouldEqualten(){
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }
}