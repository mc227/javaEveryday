import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    @Test
    void first() {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] myInts = { 1,2,3,1 };
        assertEquals(containsDuplicates.containsDuplicates(myInts),true);
    }
}