package UnitThreeOne;

// UnitThree.java
import java.util.*;
import java.util.Scanner;

public class UnitThreeOne {

    // Метод map
    public static <T, R> List<R> map(List<T> list, Function<T, R> func) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(func.apply(item));
        }
        return result;
    }

    public static void run(Scanner scanner) {
        System.out.println("Задание 3: Функция (Map)");

        // Пример 1: длины строк
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = map(strings, s -> s.length());
        System.out.println("Длины строк: " + lengths);

        // Пример 2: модуль чисел
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> absNumbers = map(numbers, Math::abs);
        System.out.println("Модули чисел: " + absNumbers);

        // Пример 3: максимум в массивах
        List<int[]> arrays = Arrays.asList(
                new int[]{1, 5, 3},
                new int[]{-2, -7, -1},
                new int[]{10, 2}
        );
        List<Integer> maxes = map(arrays, arr -> {
            if (arr.length == 0) return Integer.MIN_VALUE;
            int max = arr[0];
            for (int x : arr) if (x > max) max = x;
            return max;
        });
        System.out.println("Максимумы в массивах: " + maxes);
    }
}