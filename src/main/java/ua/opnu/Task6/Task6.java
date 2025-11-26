package ua.opnu.task6;

import java.util.function.Function;
import java.util.Arrays;

public class Task6 {
    static Function<Integer, Integer> twoToPower = n -> 1 << n;

    public static int[] transform(int[] source, Function<Integer, Integer> rule) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = rule.apply(source[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] output = transform(values, twoToPower);

        System.out.println("Input values:  " + Arrays.toString(values));
        System.out.println("Result values: " + Arrays.toString(output));
    }
}
