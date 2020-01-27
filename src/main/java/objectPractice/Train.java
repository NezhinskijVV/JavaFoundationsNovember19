package objectPractice;

public class Train {

    public static void main(String[] args) {
        Man man1 = new Man("Боб", 32.0,
                180.0,180.0, "+180");

        Man man2 = new Man("Боб", 32.0,
                180.0,180.0, "+1800");
//
//        System.out.println("man1 == man2 = " + (man1 == man2));
//        Man man3 = man1;
//        System.out.println("man1 == man3 = " + (man1 == man3));

        System.out.println(man1.hashCode());
        System.out.println(man2.hashCode());
        System.out.println("man1.equals(man2) = "
                + man1.equals(man2));
        System.out.println(man1.hashCode());
        System.out.println(man2.hashCode());
//        System.out.println("man1.equals(man3) = "
//                + (man1.equals(man3)));
    }
}
//1. Girl (3 поля)
// Пляж  equals & hashCode
//2. Создать неск объектов мужиков и добавить их в один массив
//  вывести с помощью Arrays.toString(array)