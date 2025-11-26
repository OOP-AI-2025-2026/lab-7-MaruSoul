package ua.opnu.task5;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;

public class Task5 {
    public static void applyIf(int[] array, Predicate<Integer> condition, Consumer<Integer> action) {
        for (int value : array) {
            if (condition.test(value)) {
                action.accept(value);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-12, -3, 0, 1, 5, 9, 11, 15, 22};

        Predicate<Integer> isNegative = n -> n < 0;
        Consumer<Integer> printAbs = n -> System.out.println("abs(" + n + ") = " + Math.abs(n));

        Predicate<Integer> greaterThanTen = n -> n > 10;
        Consumer<Integer> printLarge = System.out::println;

        System.out.println("A: " + Arrays.toString(numbers));

        System.out.println("\nAbsolute values of negative nums:");
        applyIf(numbers, isNegative, printAbs);

        System.out.println("\nNums > 10:");
        applyIf(numbers, greaterThanTen, printLarge);
    }
}