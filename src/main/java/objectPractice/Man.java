package objectPractice;

import java.util.Objects;

public class Man {
    private String name;
    private double age;
    private double height;
    private double weight;
    private String telephone;

    public Man(String name, double age, double height,
               double weight, String telephone) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.telephone = telephone;
    }

    public Man(String name) {
        this.name = name;
    }

    //man1.equals(man2)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return  Double.compare(man.age, age) == 0 &&
                Double.compare(man.height, height) == 0 &&
                Double.compare(man.weight, weight) == 0 &&
                Objects.equals(name, man.name) &&
                Objects.equals(telephone, man.telephone);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 10_000);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}