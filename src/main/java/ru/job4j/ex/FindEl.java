package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element is not found");
        }
        return result;
    }
    public static void main(String[] args) throws ElementNotFoundException {
        String[] workingWeek = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        try {
            indexOf(workingWeek, "Sun");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
