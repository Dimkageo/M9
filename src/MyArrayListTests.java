public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

//        add(Object value) додає елемент в кінець
//        get(int index) повертає елемент за індексом
//        size() повертає розмір колекції
//        remove(int index) видаляє елемент із вказаним індексом
//        clear() очищає колекцію


        //Метод add
        for (int i=0; i<10; i++){
            list.add(i);
        }
        System.out.println("list = " + list);
        //Метод get
        System.out.println("list.get(4) = " + list.get(4));
        //Метод size
        System.out.println("list.size() = " + list.size());
        //Метод remove
        list.remove(8);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        //Метод clear
        list.clear();
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
    }
}

