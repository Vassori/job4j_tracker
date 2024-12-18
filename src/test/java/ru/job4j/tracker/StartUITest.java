package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void editItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Edited Item"};
        StartUI.editItem(new MockInput(answers), tracker);
        Item EditedItem = tracker.findById(item.getId());
        assertThat(EditedItem.getName()).isEqualTo("Edited Item");
    }

    @Test
    void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deleteItem(new MockInput(answers), tracker);
        Item ItemNull = tracker.findById(item.getId());
        assertThat(ItemNull).isNull();
    }
}