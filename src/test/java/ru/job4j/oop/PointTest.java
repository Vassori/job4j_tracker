package ru.job4j.oop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void whenA00B20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenAMinus20B20Then4() {
        Point a = new Point(-2, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 4;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenA22B22Then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double rsl = a.distance(b);
        double expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenAMinus22B2Minus2Then5Dot66() {
        Point a = new Point(-2, 2);
        Point b = new Point(2, -2);
        double rsl = a.distance(b);
        double expected = 5.66;
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when111to333then3Dot46() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        double rsl = a.distance3d(b);
        double expected = 3.46;
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when1Minus11toMinus33Minus3then6Dot92() {
        Point a = new Point(1, -1, 1);
        Point b = new Point(-3, 3, -3);
        double rsl = a.distance3d(b);
        double expected = 6.92;
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }
}