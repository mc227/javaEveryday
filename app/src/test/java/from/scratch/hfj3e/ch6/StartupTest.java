package from.scratch.hfj3e.ch6;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StartupTest {
    public static void main(String[] args) {
        Startup startup = new Startup();
        startup.setLocationCells(new ArrayList<String>(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}