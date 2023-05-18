public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

//        add(Object value) додає елемент в кінець
//        size() повертає розмір колекції
//        peek() повертає перший елемент з черги
//        poll() повертає перший елемент з черги і видаляє його з колекції
//        clear() очищає колекцію


        // Метод add
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println("Queue = " + queue);

        // Метод size
        System.out.println("Queue size: " + queue.size());

        // Метод peek
        Integer firstElement = queue.peek();
        System.out.println("First element: " + firstElement);

        // Метод poll
        Integer polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue = " + queue);

        // Метод clear
        queue.clear();
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue = " + queue);
    }

}
