package interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Talkable cow = new Cow();
        cow.talk();

        Talkable murzik = new Cat();
        murzik.talk();
//          murzik.talk(3);
        murzik.print();

        SuperCow murka = new Cow();
        murka.print();
        Object object = new Object();

        SuperCow superMurka = new SuperCow();
        superMurka.setName("Matrena");
        SuperCow twinMurka = (SuperCow) superMurka.clone();
        twinMurka.setPower(200.0);

        System.out.println("superMurka.toString() = "
                + superMurka.toString());
        System.out.println("twinMurka.toString() = " + twinMurka.toString());

        int[] numsArray = new int[]{1, 6, -2, 3, 0};
        Arrays.sort(numsArray);
        System.out.println("numsArray.toString() = "
                + Arrays.toString(numsArray));

        SuperCow cow1 = new SuperCow();
        SuperCow cow2 = new SuperCow();
        SuperCow cow3 = new SuperCow();
        cow1.setPower(50.0);
        cow2.setPower(150.0);

        SuperCow[] superCowsArray = new SuperCow[]{cow1, cow2, cow3};

        Arrays.sort(superCowsArray);
        System.out.println("Arrays.toString(superCowsArray) = "
                + Arrays.toString(superCowsArray));

         Cow superCow = new Cow();
        cow1.compareTo(superCow);
//        System.out.println(cow2.compareTo("Bad string"));

    }
}
