package ua.opnu.task7;

import java.util.Arrays;
import java.util.function.Function;

public class Task7 {
    public static String[] stringify(int[] numbers, Function<Integer, String> mappingFunction) {
        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = mappingFunction.apply(numbers[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Function<Integer, String> numberToWord = n -> {
            String[] words = {"нуль", "один", "два", "три", "чотири",
                    "п'ять", "шість", "сім", "вісім", "дев'ять"};
            return words[n];
        };

        String[] result = stringify(values, numberToWord);

        System.out.println("Input:  " + Arrays.toString(values));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
