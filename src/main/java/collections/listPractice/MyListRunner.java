package collections.listPractice;

import objectPractice.Cake;

public class MyListRunner {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Эклер", 2.0, true));
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Буше", 1.0, false));
        System.out.println("list.size() = " + list.size());
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));
//        list.add(new Cake("Буше", 1.0, false));

        System.out.println(list.toString());
        System.out.println("list.size() = " + list.size());


    }
}
