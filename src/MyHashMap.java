import java.util.Objects;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private Node<K, V>[] buckets;
    private int size;

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid capacity: " + capacity);
        }
        buckets = new Node[capacity];
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> newNode = new Node<>(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node<K, V> current = buckets[index];
            while (current != null) {
                if (Objects.equals(current.getKey(), key)) {
                    current.setValue(value);
                    return;
                }
                if (current.getNext() == null) {
                    current.setNext(newNode);
                    break;
                }
                current = current.getNext();
            }
        }
        size++;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        Node<K, V> previous = null;
        while (current != null) {
            if (Objects.equals(current.getKey(), key)) {
                if (previous == null) {
                    buckets[index] = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public void clear() {
        buckets = new Node[buckets.length];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (Objects.equals(current.getKey(), key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Node<K, V> bucket : buckets) {
            Node<K, V> current = bucket;
            while (current != null) {
                sb.append(current.getKey()).append("=").append(current.getValue()).append(", ");
                current = current.getNext();
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }
}
