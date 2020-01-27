package oop;

public class DogHouse {
    public static void main(String[] args) {
        Dog grand = new Dog("Grand");

        System.out.println(grand.getName());
        grand.setName("Viktor");

        System.out.println(grand.getName());

        System.out.println("Math.sqrt(4.0) = " + Math.sqrt(4.0));
    }
}