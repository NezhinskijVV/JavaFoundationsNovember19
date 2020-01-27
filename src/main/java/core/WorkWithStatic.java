package core;

public class WorkWithStatic {

    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat barsik = new Cat();

//        murzik.setIsLoveMilk();

        Cat.isLoveMilk = false;

        System.out.println(murzik.getIsLoveMilk());
        System.out.println(barsik.getIsLoveMilk());
    }
}
