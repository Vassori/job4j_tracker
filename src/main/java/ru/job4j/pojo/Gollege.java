package ru.job4j.pojo;

public class Gollege {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Oleg Komissarov");
        student.setGroup("job4j - 0");
        student.setDate("19.07.2022");
        System.out.println("Студент " + student.getName() + " из группы "
                + student.getGroup() + ". Зачислен " + student.getDate() + ".");
    }
}
