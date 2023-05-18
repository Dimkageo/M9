public class MyStackTest {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

//        push(Object value) додає елемент в кінець
//        remove(int index) видаляє елемент за індексом
//        size() повертає розмір колекції
//        peek() повертає перший елемент стеку
//        pop() повертає перший елемент стеку та видаляє його з колекції
//        clear() очищає колекцію

        // Добавление элементов
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Stack : " + stack);

        // Удаляем по индексу 8
        stack.remove(8);
        System.out.println("Stack after removal 8: " + stack);

        // Возвращаем размер
        System.out.println("Stack size: " + stack.size());

        // Возвращаем 1 элемент
        System.out.println("Peeked 1 element: " + stack.peek());

        // Возвращаем и удаляем 1 элемент
        System.out.println("Popped 1 element: " + stack.pop());
        System.out.println("Stack : " + stack);

        // Очищаем колекцию
        stack.clear();
        System.out.println("Stack after clearing: " + stack);

    }
}
