package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ItemsSorterTest {

    @Test
    void whenAscByName() {
        List<Item> items = new ArrayList<>(List.of(
                new Item("Passport"),
                new Item("Contact number"),
                new Item("Contact email")
        ));
        List<Item> expected = List.of(
                new Item("Contact email"),
                new Item("Contact number"),
                new Item("Passport")
        );
        items.sort(new ItemAscByName());
        assertThat(items).containsExactlyElementsOf(expected);
    }

    @Test
    void whenDescByName() {
        List<Item> items = new ArrayList<>(List.of(
                new Item("Passport"),
                new Item("Contact email"),
                new Item("Contact number")
        ));
        List<Item> expected = List.of(
                new Item("Passport"),
                new Item("Contact number"),
                new Item("Contact email")
        );
        items.sort(new ItemDescByName());
        assertThat(items).containsExactlyElementsOf(expected);
    }
}