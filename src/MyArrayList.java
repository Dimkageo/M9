import java.util.Arrays;

public class MyArrayList {
    Object[] array = {"hello", "world", 123};

    public void add(Object value) {
        Object[] newArray = new Object[array.length + 1]; // Создаем новый массив на 1 элемент больше
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; // Копируем все элементы из старого массива в новый
        }
        newArray[array.length] = value; // Добавляем новый элемент в конец нового массива
        array = newArray; // Заменяем старый массив на новый
        System.out.println(Arrays.toString(array));
    }

    public void remove(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return;
        }
        Object[] newArray = new Object[array.length - 1]; // Создаем новый массив на 1 элемент меньше
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) { // Пропускаем элемент с указанным индексом
                newArray[j] = array[i]; // Копируем все остальные элементы в новый массив
                j++;
            }
        }
        array = newArray; // Заменяем старый массив на новый
        System.out.println(Arrays.toString(array));
    }

    public void size() {
        System.out.println("Size of list: " + array.length);
    }

    public void get(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
        }
        System.out.println("Element at index 1: " + array[index]);
    }

    public void clear() {
        array = new Object[0];
        System.out.println("Array is cleared");
    }
}
class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("End"); // Добавляем элемент в конец
        list.remove(2); // Удаляем элемент с индексом 2
        list.size(); // Возвращает длину массива
        list.get(1); // Возвращает элемент с индексом 1
        list.clear(); // Очищаем массив
    }
}
