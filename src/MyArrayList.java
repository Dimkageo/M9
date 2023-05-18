
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;

    private Object[] data; // Массив
    private int index;

    public MyArrayList() {
        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resizeIfNeed();//Проверка и увеличение массива
        data[index] = value;
        index++;
    }

    private void resizeIfNeed() { // Метод увеличивающий массив
        if (index == data.length) {
            int newSize = data.length *2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int i) {
        return (T) data[i];
    }

    public int size() {
        return index;
    }
    public void remove(int ind) {
        if (ind < 0 || ind >= data.length) {
            System.out.println("Invalid index");
            return;
        }
        Object[] newArray = new Object[data.length - 1]; // Создаем новый массив на 1 элемент меньше
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != ind) { // Пропускаем элемент с указанным индексом
                newArray[j] = data[i]; // Копируем все остальные элементы в новый массив
                j++;
            }
        }
        data = newArray; // Заменяем старый массив на новый
        index --;
//        System.out.println(Arrays.toString(data));
    }

    public void clear() {
        data = new Object[0];
        index = 0;
    }


    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            if (data[i] != null) {
                result.add(data[i].toString());
            }
        }
        return "[" + result + "]";
    }
}