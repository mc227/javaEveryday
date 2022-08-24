import junit.framework.TestCase;

public class BinaryToDecimalTest extends TestCase {
    public void testZeroBinary() {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        assertEquals(binaryToDecimal.convertToDecimal("0"), 0);
    }
}