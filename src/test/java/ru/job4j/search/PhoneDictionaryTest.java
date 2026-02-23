package ru.job4j.search;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    void whenListIsEmpty() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Stepan", "Burlak", "9991999", "Rostov")
        );
        ArrayList<Person> persons = phones.find("989");
        assertThat(persons).isEmpty();
    }

    @Test
    void whenKeyIsEmptyThenListIsEmpty() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Stepan", "Burlak", "9991999", "Rostov")
        );
        ArrayList<Person> persons = phones.find("");
        assertThat(persons).isEmpty();
    }
}