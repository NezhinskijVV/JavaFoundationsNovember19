package strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Я замечательная строка";
        System.out.println(str.substring(2));
        System.out.println("str.equalsIgnoreCase(\"Я замечательная строкА\") = " + str.equalsIgnoreCase("Я замечательная строкА"));
        System.out.println(str);
        str.equals("");

        //пул строк
        String str2 = "Я замечательная строка";
        System.out.println(str == str2);

        //создание явно строки вне пула
        String str3 = new String("Я замечательная строка");
        System.out.println(str == str3);

        str3 = str3.intern();
        System.out.println(str == str3);

        String bad = "Bad";
        for (int i = 0; i < 100000; i++) {
            bad = bad + i;
        }
        System.out.println(bad);

        StringBuilder goodBuilder = new StringBuilder("Good");
        for (int i = 0; i < 100000; i++) {
            goodBuilder.append(i);
        }
        System.out.println(goodBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();
    }
}

//HW:
//1.Реализовать для SuperCat методы compareTo() и clone().
//2. Создать объекты и отсортировать.
// (Часть объектов создавать с помощью clone)
//3. Поиграться с методами класса String
//4. Аудио equals(), hashCode() и compareTo()