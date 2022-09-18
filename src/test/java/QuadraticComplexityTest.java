import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticComplexityTest {
    @Test
    void Test123() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};
        ArrayList<Integer> gfg = new ArrayList<>(Arrays.asList(1,2,3));
        QuadraticComplexity quadraticComplexity = new QuadraticComplexity();
        assertEquals(quadraticComplexity.intersection(first,second), gfg);
    }
}