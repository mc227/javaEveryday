import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvalRPNTest {
    @Test
    void MarkCostales() {
        EvalRPN evalRPN = new EvalRPN();
        String[] myStrings = { "2", "1", "+", "3", "*" };
        assertEquals(evalRPN.evalRPN(myStrings),9);
    }
}