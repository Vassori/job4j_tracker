package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        String[] array1 = s1.split("\\.");
        String[] array2 = s2.split("\\.");
        int minSize = Math.min(array1.length, array2.length);
        for (int index = 0; index < minSize; index++) {
            String str1 = array1[index];
            String str2 = array2[index];
            if (Character.isDigit(str1.charAt(0)) && Character.isDigit(str2.charAt(0))) {
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                if (num1 != num2) {
                    return Integer.compare(num1, num2);
                }
            }
        }
        return Integer.compare(s1.length(), s2.length());
    }
}