import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearComplexityTest {
    @Test
    void Sallysellsseashellsontheseashore() {
        LinearComplexity linearComplexity = new LinearComplexity();
        assertEquals(linearComplexity.countChars('a',"Sally sells sea shells on the seashore"),3);
    }
}