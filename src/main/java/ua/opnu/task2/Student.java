package ua.opnu.task2;

import java.util.Arrays;

public class Student {
    private String surname;
    private String name;
    private String group;
    private int[] marks;

    public Student(String surname, String name, String group, int[] marks) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " from " + group + "group has marks: " + Arrays.toString(marks);
    }
}