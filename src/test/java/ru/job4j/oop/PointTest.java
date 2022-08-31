package ru.job4j.oop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void whenA00B20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2.0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenAMinus20B20Then2() {
        Point a = new Point(-2, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 4.0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenA22B22Then2() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double rsl = a.distance(b);
        double expected = 0.0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenAMinus22B2Minus2Then() {
        Point a = new Point(-2, 2);
        Point b = new Point(2, -2);
        double rsl = a.distance(b);
        double expected = 5.66;
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }
}