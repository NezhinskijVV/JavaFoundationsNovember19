package oop.practice;

public class FigureRunner {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle();
//        System.out.println(rect.getLength());

        Figure figureRect = new Rectangle(4.0, 3.0);
        Rectangle realRect = new Rectangle(4.0, 3.0);

        System.out.println(realRect.getName());
        System.out.println("figureRect.calcSquare() = " + figureRect.calcSquare());


    }
}
