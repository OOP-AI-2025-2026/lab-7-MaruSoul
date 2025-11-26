package ua.opnu.task3;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {
    static int[] filterByTwoConditions(int[] input, Predicate<Integer> firstCondition, Predicate<Integer> secondCondition) {
        int[] temp = new int[input.length];
        int index = 0;

        for (int value : input) {
            if (firstCondition.test(value) && secondCondition.test(value)) {
                temp[index++] = value;
            }
        }

        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {

        int[] numbers = {-9, -6, -3, 0, 1, 3, 4, 6, 9, 12, 15};

        Predicate<Integer> isPositive = n -> n > 0;

        Predicate<Integer> divisibleByThree = n -> n % 3 == 0;

        int[] result = filterByTwoConditions(numbers, isPositive, divisibleByThree);

        System.out.println("А " + Arrays.toString(numbers));
        System.out.println("Positive nums witch divisible by three: " + Arrays.toString(result));
    }
}
