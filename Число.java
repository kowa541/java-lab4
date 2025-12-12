package UnitOneThree;

public class Число implements Сравнимое<Число> {
    private int значение;

    public Число(int значение) {
        this.значение = значение;
    }

    public int получитьЗначение() {
        return значение;
    }

    @Override
    public int сравнить(Число другой) {
        return Integer.compare(this.значение, другой.значение);
    }

    @Override
    public String toString() {
        return String.valueOf(значение);
    }
}
