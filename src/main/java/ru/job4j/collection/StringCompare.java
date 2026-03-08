package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int index = 0; index < minLength; index++) {
            int result = Character.compare(s1.charAt(index), s2.charAt(index));
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(s1.length(), s2.length());
    }
}
