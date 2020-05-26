package woznia.michal.pl.library;

import java.util.List;

public class Actors   {
    private String name;
    private int age;

    public Actors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String actorDescripion(){
        return " Imię i nazwisko aktora " + getName() + " Wiek aktora " + getAge();
    }

}
