package strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Я замечательная строка";
        System.out.println(str.substring(2));
        System.out.println("str.equalsIgnoreCase(\"Я замечательная строкА\") = " + str.equalsIgnoreCase("Я замечательная строкА"));
        System.out.println(str);
    }
}

//HW:
//1.Реализовать для SuperCat методы compareTo() и clone().
//2. Создать объекты и отсортировать.
// (Часть объектов создавать с помощью clone)
//3. Поиграться с методами класса String
//4. Аудио equals(), hashCode() и compareTo()