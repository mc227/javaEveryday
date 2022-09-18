import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    @Test
    void TestOne() {
        Search search = new Search();
        String[] myStrings = { "One", "Two", "Three" };
        assertEquals(search.search("One",myStrings),0);
    }
}