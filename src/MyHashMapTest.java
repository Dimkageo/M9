public class MyHashMapTest {
    public static void main(String[] args) {

//        put(Object key, Object value) додає пару ключ + значення
//        remove(Object key) видаляє пару за ключем
//        clear() очищає колекцію
//        size() повертає розмір колекції
//        get(Object key) повертає значення (Object value) за ключем

        MyHashMap<String, Integer> map = new MyHashMap<>();

        // Метод put
        for (int i = 1; i <= 9; i++) {
            String key = Integer.toString(i);
            map.put(key, i);
        }
        System.out.println("Map: " + map);

        // Метод remove
        map.remove("3");
        System.out.println("Map -3: " + map);

        // Метод get
        System.out.println("Value for '5': " + map.get("5"));

        // Метод size
        System.out.println("Size: " + map.size());

        // Метод clear
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
