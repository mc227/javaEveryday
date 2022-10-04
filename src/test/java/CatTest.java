import org.junit.jupiter.api.Test;

import java.io.*;

class CatTest {
    @Test
    void mark() throws Exception {
        Cat cat = new Cat();
        PrintWriter writer = new PrintWriter("cat.txt");
        BufferedReader reader = new BufferedReader(
                new FileReader("CatInput.txt"));
        cat.load(reader);
        cat.save(writer);
    }
}