package UnitOneThree;

public class UnitOneThree {

    public static void run() {
        System.out.println("Задание 1.10: Сравнимое");

        Число a = new Число(10);
        Число b = new Число(20);

        int result = a.сравнить(b);
        System.out.println("Результат сравнения " + a + " и " + b + ": " + result);
        // Отрицательное число — a < b
    }
}
