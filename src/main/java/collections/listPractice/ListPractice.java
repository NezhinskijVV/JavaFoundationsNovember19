package collections.listPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Александр");
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.contains(\"Александр\") = " + arrayList.contains("Александр"));
//        System.out.println("arrayList.remove(0) = " + arrayList.remove(0));
        arrayList.clear();
//        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        arrayList.add("Александр");
//        arrayList.add("Иван");
        arrayList.add("Виталий");
        arrayList.add("Дмитрий");
//        arrayList.add("Иван");


        System.out.println("Вывод списка (for- each):");
        for (String s : arrayList){
            System.out.println(s);
        }

        System.out.println("Вывод списка (for):");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        boolean flag = false;
        for (int i = 0; i < arrayList.size() ; i++) {
            if (arrayList.get(i).equalsIgnoreCase("ИваН")){
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Иванов нет");
        }
    }
}
//Задача 1:
// Вывести все элементы списка в обратном порядке
//Задача 2:
// Найти элементы списка, которые равны без учета регистра
// "ИвАн" и вывести их индексы.
//Задача 2*
// Вывести сообщение "Ивана нет", если его нет в списке
//Задача 3
// Создать список Integer. Вывести все элементы делящиеся на 3.