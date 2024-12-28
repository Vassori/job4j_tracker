package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Factorial().calc(-1));
        assertThat(exception.getMessage()).isEqualTo("The number cannot be less than 0");
    }

    @Test
    public void whenCorrectTest() {
        int number = 0;
        int result = new Factorial().calc(number);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}