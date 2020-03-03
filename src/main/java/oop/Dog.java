package oop;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private String breed;
    private boolean isBark;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}