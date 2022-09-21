import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTest {
    @Test
    void foo() {
        Intersection intersection = new Intersection();
        assertEquals(intersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}), Arrays.asList(4,2,
                3));
    }
}