package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        String[] array1 = s1.split("\\.");
        String[] array2 = s2.split("\\.");
        int elArray1 = Integer.parseInt(array1[0]);
        int elArray2 = Integer.parseInt(array2[0]);
        return Integer.compare(elArray1, elArray2);
    }
}