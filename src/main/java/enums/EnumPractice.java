package enums;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(Seasons.SPRING.name());
        Seasons[] seasonsArray = Seasons.values();
        System.out.println("seasonsArray[0] = " + seasonsArray[0].name());

        System.out.println("For each for enum:");
        for (Seasons season : seasonsArray
        ) {
            System.out.println(season.name() + " " + season.ordinal());

        }

        System.out.println(Seasons.valueOf("SPRING"));

        Color.values()[0].prettyPrintColorNumber();
        Color.values()[1].prettyPrintColorNumber();

        System.out.println(Color.BLUE.getClass().getSuperclass());

        System.out.println(new Movie("Тупой еще тупее", Genre.COMEDY));
    }
}
//Класс Фильм
//Название и жанр(описывается Enum)
