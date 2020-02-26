package collections.listPractice;

import objectPractice.Man;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet();
        mySet.add("Vasya");
        mySet.add("Kirill");
        mySet.add("Vanya");
        System.out.println(mySet.add("Vanya"));

        for(String elem : mySet){
            System.out.println(elem);
        }

        Map<String, Man> myMap = new HashMap<>();

        myMap.put("Alex", new Man("Александр"));
        myMap.put("Vitaliy", new Man("Виталий"));
        myMap.put("Vitaliy", new Man("Саша"));

        System.out.println("Print Map");
        for (String name : myMap.keySet()){
            System.out.println(myMap.get(name));
        }

        System.out.println("Entry:");
        for (Map.Entry<String, Man> mapElement : myMap.entrySet()){
            System.out.println(mapElement.getKey());
        }



    }
}
