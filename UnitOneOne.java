package UnitOneOne;
import java.util.Scanner;

public class UnitOneOne {

    // Метод, принимающий коробку и извлекающий значение
    public static void processBox(Box<Integer> box) {
        Integer value = box.get(); // извлекаем и обнуляем
        System.out.println("Извлечено из коробки: " + value);
    }

    public static void run(Scanner scanner) {
        System.out.println("Задание 1.4: Обобщённая коробка");

        // Создаём коробку для Integer
        Box<Integer> intBox = new Box<>();

        // Кладём значение 3
        intBox.put(3);
        System.out.println("Число 3 помещено в коробку.");

        // Передаём коробку в метод
        processBox(intBox);

        // Проверка, что коробка теперь пуста
        if (intBox.isEmpty()) {
            System.out.println("Коробка пуста после извлечения.");
        }
    }
}
