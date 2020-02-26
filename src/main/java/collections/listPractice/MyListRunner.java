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

        MyLinkedList linkedList = new MyLinkedList();
//        Node n1 = new Node("1", null);
//        linkedList.add(new Node("1", new Node("3", new Node
//                ("7", new Node("5", new Node("0", null))))));

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        System.out.println("linkedList.toString() = " + linkedList.toString());

        linkedList.remove(3);
        System.out.println("linkedList.toString() = " + linkedList.toString());
//        linkedList.remove(8);
        linkedList.remove(1);
    }
}
