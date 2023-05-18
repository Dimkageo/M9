import java.util.StringJoiner;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            top = top.next;
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> currentNode = prevNode.next;
            prevNode.next = currentNode.next;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        }

        return top.value;
    }

    public T pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        }

        T poppedValue = top.value;
        top = top.next;
        size--;
        return poppedValue;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    private Node<T> getNode(int index) {
        Node<T> currentNode = top;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ", "[", "]");
        Node<T> currentNode = top;
        while (currentNode != null) {
            result.add(currentNode.value.toString());
            currentNode = currentNode.next;
        }
        return result.toString();
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
