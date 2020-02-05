package interfaces;

public class Cat implements Talkable, Swimable {

    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void printSwim() {
        if (swim()) {
            System.out.println("I swim!");
        }
    }

    @Override
    public void print() {
        System.out.println("Cat");
    }
    //
//    @Override
//    public void talk(int countOfLegs) {
//
//    }
}
