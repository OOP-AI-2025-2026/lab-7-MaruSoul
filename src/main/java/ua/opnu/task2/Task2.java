package ua.opnu.task2;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {
    static Predicate<Student> hasDebt = student -> {
        for (int mark : student.getMarks()) {
            if (mark < 60) return true;
        }
        return false;
    };

    public static Student[] filterStudents(Student[] students, Predicate<Student> condition) {
        Student[] temp = new Student[students.length];
        int index = 0;

        for (Student s : students) {
            if (condition.test(s)) {
                temp[index++] = s;
            }
        }
        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Winger", "Jeff", "CS-201", new int[]{95, 88, 91}),
                new Student("Perry", "Britta", "CS-201", new int[]{70, 55, 80}),
                new Student("Nadir", "Abed", "CS-202", new int[]{100, 100, 98}),
                new Student("Barnes", "Troy", "CS-201", new int[]{64, 48, 60}),
                new Student("Edison", "Annie", "CS-201", new int[]{100, 99, 100}),
                new Student("Bennett", "Shirley", "CS-202", new int[]{58, 75, 62}),
                new Student("Hawthorne", "Pierce", "CS-202", new int[]{40, 35, 50})
        };

        Student[] studentsWithDebts = filterStudents(group, hasDebt);
        System.out.println("Students with debts:");
        for (Student s : studentsWithDebts) {
            System.out.println(s);
        }

        Student[] studentsWithoutDebts = filterStudents(group, hasDebt.negate());
        System.out.println("\nStudents without debts:");
        for (Student s : studentsWithoutDebts) {
            System.out.println(s);
        }
    }
}
