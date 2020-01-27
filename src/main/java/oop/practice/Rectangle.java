package oop.practice;

public class Rectangle extends Figure {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public  Rectangle(){}
//
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }

    public String getName(){
        return "I'm rectangle";
    }

    @Override
    public double calcSquare() {
        return length * width;
    }
}
