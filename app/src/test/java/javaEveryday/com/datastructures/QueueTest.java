package javaEveryday.com.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test
    void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        assertThrows(NullPointerException.class, () ->{
            String name = null;
            Optional.of(name);
        });
    }
}