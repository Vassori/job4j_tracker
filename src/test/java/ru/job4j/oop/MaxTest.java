package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1To4Then4() {
        int one = 2;
        int two = 1;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To5To1To5Then5() {
        int one = 2;
        int two = 5;
        int three = 1;
        int four = 5;
        int result = Max.max(one, two, three, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}