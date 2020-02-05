package oop.practice;

public abstract class Figure {

    public abstract double calcSquare();
//    {
//        System.out.println("Площадь не может быть посчитана");
//        return -1.0;
//    }

    public double calcPerimeter() {
        System.out.println("Площадь не может быть посчитана");
        return -1.0;
    }
}
