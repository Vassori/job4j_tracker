package ru.job4j.ex;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class FindTest {

    @Test
    void whenIndexIsNegative() {
        String[] data = {"one", "two", "three"};
        int index = -3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Find.get(data, index)
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bounds");
    }

    @Test
    void whenIndexIsGreaterThanArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 10;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Find.get(data, index)
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bounds");
    }

    @Test
    void henIndexEqualsArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Find.get(data, index)
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bounds");
    }

    @Test
    void whenIndexIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 1;
        String expected = "two";
        String result = Find.get(data, index);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIndexIs0ThenItIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 0;
        String expected = "one";
        String result = Find.get(data, index);
        assertThat(result).isEqualTo(expected);

    }
}