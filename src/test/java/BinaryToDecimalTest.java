import junit.framework.TestCase;

public class BinaryToDecimalTest extends TestCase {
    public void testZeroBinary() {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        assertEquals(binaryToDecimal.convertToDecimal("0"), 0);
    }

    public void test55() {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        assertEquals(binaryToDecimal.convertToDecimal("110111"),55);
    }
}