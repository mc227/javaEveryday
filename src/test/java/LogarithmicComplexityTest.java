import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogarithmicComplexityTest {
    @Test
    void foo() {
        LogarithmicComplexity logarithmicComplexity = new LogarithmicComplexity();
        int[] array = {1,2,3,4};
        assertEquals(logarithmicComplexity.binarySearch(4,array),true);
    }
}