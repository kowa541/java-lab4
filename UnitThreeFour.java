package UnitThreeFour;

import java.util.*;
import java.util.function.Function;

public class UnitThreeFour {

    // Группировка: создаём Map<K, List<T>>
    public static <T, K> Map<K, List<T>> collect(
            List<T> list,
            Supplier<Map<K, List<T>>> mapSupplier,
            Function<T, K> keyMapper) {

        Map<K, List<T>> result = mapSupplier.get();
        for (T item : list) {
            K key = keyMapper.apply(item);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(item);
        }
        return result;
    }

    public static void run() {
        System.out.println("Задание 6: Коллекционирование");

        // Пример 1: положительные / отрицательные
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        Map<String, List<Integer>> signGroups = collect(
                numbers,
                HashMap::new,
                x -> x > 0 ? "positive" : "negative"
        );
        System.out.println("Группировка по знаку: " + signGroups);

        // Пример 2: строки по длине
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx", "qw");
        Map<Integer, List<String>> byLength = collect(
                strings,
                HashMap::new,
                String::length
        );
        System.out.println("Группировка по длине: " + byLength);

        // Пример 3: уникальные строки → используем Set
        List<String> withDuplicates = Arrays.asList("qwerty", "asdfg", "qwerty", "qw");
        Set<String> unique = new LinkedHashSet<>(withDuplicates); // просто Set
        System.out.println("Уникальные строки: " + unique);


    }
}
