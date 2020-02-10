package exceptions;

public class ExceptionRunner {
    public static void main(String[] args) {
//        throw new ExceptionInInitializerError();
        Man alexandr = new Man("Alexandr", 10);

        try {
            alexandr.setAge(-5);
        } catch (MyBeautifulException ex) {
            System.err.println("Bad Age");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
