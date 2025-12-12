package UnitThreeTwo;

import java.util.*;
import java.util.Scanner;

public class UnitThreeTwo {

    public static <T> List<T> filter(List<T> list, Predicate<T> pred) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (pred.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void run(Scanner scanner) {
        System.out.println("Задание 4: Фильтр");

        // Пример 1: строки длиной >= 3
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<String> longStrings = filter(strings, s -> s.length() >= 3);
        System.out.println("Строки длиной >=3: " + longStrings);

        // Пример 2: положительные числа
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> positives = filter(numbers, x -> x > 0);
        System.out.println("Положительные числа: " + positives);

        // Пример 3: массивы без положительных чисел
        List<int[]> arrays = Arrays.asList(
                new int[]{-1, -2, -3},
                new int[]{1, 2},
                new int[]{-5, 0, -10}
        );
        List<int[]> nonPositiveArrays = filter(arrays, arr -> {
            for (int x : arr) {
                if (x > 0) return false;
            }
            return true;
        });
        System.out.println("Массивы без положительных чисел: " + nonPositiveArrays.size() + " шт.");
    }
}
