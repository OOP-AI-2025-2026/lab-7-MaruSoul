package ua.opnu.task1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task1 {

    static Predicate<Integer> isPrime = number -> {
        if (number == null || number < 2) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    };

    public static void main(String[] args) {

        int[] nums = { -5, -1, 0, 1, 2, 3, 4, 5, 11, 15, 17, 19 };

        System.out.println("A : " + Arrays.toString(nums));
        System.out.println("Prime A:");

        for (int value : nums) {
            if (isPrime.test(value)) {
                System.out.print(value + " ");
            }
        }
    }
}
