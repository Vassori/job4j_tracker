package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        if (key == null || key.isEmpty()) {
            return result;
        }
        for (Person person : persons) {
            if ((person.getName() != null && person.getName().contains(key))
                    || (person.getSurname() != null && person.getSurname().contains(key))
                    || (person.getPhone() != null && person.getPhone().contains(key))
                    || (person.getAddress() != null && person.getAddress().contains(key))) {
                result.add(person);
            }
        }
        return result;
    }
}
