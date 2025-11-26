package ua.opnu.task4;

import ua.opnu.task2.Student;

public class Task4 {

    // forEach function: applies given action to each student
    public static void forEach(Student[] students, StudentConsumer action) {
        for (Student s : students) {
            action.accept(s);
        }
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Winger", "Jeff", "CS-201", new int[]{95, 88, 91}),
                new Student("Perry", "Britta", "CS-201", new int[]{70, 55, 80}),
                new Student("Nadir", "Abed", "CS-202", new int[]{100, 100, 98}),
                new Student("Barnes", "Troy", "CS-201", new int[]{64, 48, 60}),
                new Student("Edison", "Annie", "CS-201", new int[]{100, 99, 100})
        };

        StudentConsumer printFullName = student ->
                System.out.println(student.getSurname() + " " + student.getName());

        System.out.println("Students:");
        forEach(group, printFullName);
    }
}