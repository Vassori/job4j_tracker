package ru.job4j.collection;

import java.util.Comparator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class JobTest {

    @Test
    void whenAscByName() {
        Comparator<Job> comparator = new JobAscByName();
        int result = comparator.compare(
                new Job("Learn Java", 1),
                new Job("Learn Japanese", 2)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    void whenDescByName() {
        Comparator<Job> comparator = new JobDescByName();
        int result = comparator.compare(
                new Job("Learn Java", 1),
                new Job("Learn Japanese", 2)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenAscByPriority() {
        Comparator<Job> comparator = new JobAscByPriority();
        int result = comparator.compare(
                new Job("Learn Java", 1),
                new Job("Learn Japanese", 2)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenDescByPriority() {
        Comparator<Job> comparator = new JobDescByPriority();
        int result = comparator.compare(
                new Job("Learn Java", 1),
                new Job("Learn Japanese", 2)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenDescCombineByNamesAndPriority() {
        Comparator<Job> combine = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = combine.compare(
                new Job("Learn Java", 1),
                new Job("Learn Java", 2)
        );
        assertThat(result).isGreaterThan(0);
    }
}