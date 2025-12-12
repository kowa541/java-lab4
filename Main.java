import UnitOneOne.UnitOneOne;
import UnitOneThree.UnitOneThree;
import UnitTwoTwo.UnitTwoTwo;
import UnitThreeOne.UnitThreeOne;
import UnitThreeTwo.UnitThreeTwo;
import UnitThreeThree.UnitThreeThree;
import UnitThreeFour.UnitThreeFour;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Лабораторная 4");
        Scanner me = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите задание из списка 1.1, 1.3, 2.2, 4.1, 4.2, 4.3, 4.4 или 0 для завершения");
            System.out.print("Введите Ваш выбор: ");
            String input0 = me.nextLine().trim();
            if (input0.equals("0")) {
                System.out.println("Завершение работы");
                break;
            }
            switch (input0) {
                case "1.1":
                    UnitOneOne.run(me);
                    break;
                case "1.3":
                    UnitOneThree.run();
                    break;
                case "2.2":
                    UnitTwoTwo.run();
                    break;
                case "4.1":
                    UnitThreeOne.run(me);
                    break;
                case "4.2":
                    UnitThreeTwo.run(me);
                    break;
                case "4.3":
                    UnitThreeThree.run(me);
                    break;
                case "4.4":
                    UnitThreeFour.run();
                    break;
                default:
                    System.out.println("Нет такого номера");
                    break;

            }

        }
    }
}