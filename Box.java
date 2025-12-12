package UnitTwoTwo;

public class Box<T> {
    private T item;

    public void put(T item) {
        if (this.item != null) {
            throw new IllegalStateException("Коробка уже содержит объект!");
        }
        this.item = item;
    }

    public T get() {
        T temp = this.item;
        this.item = null; // обнуляем ссылку
        return temp;
    }

    public boolean isEmpty() {
        return this.item == null;
    }

    public boolean isFull() {
        return !isEmpty();
    }
}