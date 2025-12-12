package UnitThreeThree;
import UnitThreeOne.UnitThreeOne;
import java.util.*;
import java.util.Scanner;

public class UnitThreeThree {

    // Безопасный reduce: требует начальное значение
    public static <T> T reduce(List<T> list, T identity, BinaryOperator<T> accumulator) {
        T result = identity;
        for (T item : list) {
            result = accumulator.apply(result, item);
        }
        return result;
    }

    public static void run(Scanner scanner) {
        System.out.println("Задание 5: Сокращение (Reduce)");

        // Пример 1: конкатенация строк
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        String concat = reduce(strings, "", (a, b) -> a + b);
        System.out.println("Конкатенация: " + concat);

        // Пример 2: сумма чисел
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        int sum = reduce(numbers, 0, Integer::sum);
        System.out.println("Сумма: " + sum);

        // Пример 3: общее количество элементов во вложенных списках
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3),
                Arrays.asList(4, 5, 6)
        );
        // Сначала считаем длины, потом суммируем
        List<Integer> lengths = UnitThreeOne.map(listOfLists, List::size);
        int totalCount = reduce(lengths, 0, Integer::sum);
        System.out.println("Общее количество элементов: " + totalCount);

        // Проверка пустого списка
        List<String> empty = new ArrayList<>();
        String emptyResult = reduce(empty, "пусто", (a, b) -> a + b);
        System.out.println("Результат для пустого списка: " + emptyResult);
    }
}
