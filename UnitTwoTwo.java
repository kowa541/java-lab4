package UnitTwoTwo;

import java.util.Arrays;
import java.util.List;

public class UnitTwoTwo {

    // Метод, принимающий набор коробок с числами и возвращающий максимум как double
    public static double findMaxBoxValue(Box<? extends Number>... boxes) {
        Double max = null;

        for (Box<? extends Number> box : boxes) {
            if (!box.isEmpty()) {
                double value = box.get().doubleValue(); // извлекаем и преобразуем
                if (max == null || value > max) {
                    max = value;
                }
            }
        }

        if (max == null) {
            throw new IllegalArgumentException("Все коробки пусты!");
        }

        return max;
    }

    public static void run() {
        System.out.println("Задание 2: Поиск максимума среди коробок с числами");

        // Создаём коробки разных числовых типов
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
        Box<Float> box3 = new Box<>();

        box1.put(42);
        box2.put(3.14);
        box3.put(100.0f);

        // Ищем максимум
        double max = findMaxBoxValue(box1, box2, box3);
        System.out.println("Максимальное значение: " + max);
    }
}