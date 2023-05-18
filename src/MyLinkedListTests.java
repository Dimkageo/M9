public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

//        add(Object value) додає елемент в кінець
//        remove(int index) видаляє елемент із вказаним індексом
//        clear() очищає колекцію
//        size() повертає розмір колекції
//        get(int index) повертає елемент за індексом

        // Добавление элементов
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(11);
        System.out.println("list = " + list);

        // Получение элемента по индексу
        System.out.println("list.get(4) = " + list.get(4));

        // Размер списка
        System.out.println("list.size() = " + list.size());

        // Удаление элемента по индексу
        list.remove(8);
        System.out.println("Після видалення 8 елементу");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);

        // Очистка списка
        list.clear();
        System.out.println("Після очищення");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
    }
}
