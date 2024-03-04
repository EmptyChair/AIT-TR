package lesson_024_objectAndString.Hausaufgabe.animal;

import lesson_034_JavaFramework.Task;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int age;

    protected String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    //Constructors
    public Animal() {
        setName("A Mystery Animal");
        setAge(1);
        setSpecies("unknown");
    }

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
        setSpecies("unknown");
    }

    //to String
    public String toString() {
        String a = new String(getName()+" is an animal of unknown species which is "+getAge()+" years old.");
        return a;
    }

    public void walk() {
        System.out.println("The animal is walking as it can...");
    }

    @Override
    public boolean equals(Object obj) {
        //if object is the same - true
        if (this == obj) {
            return true;
        }
        // if object is of another class - false
        if (!(obj instanceof Animal)) {
            return false;
        }
        //cast obj as Animal and compare its attributes
        Animal animal = (Animal) obj;
        return this.name.equals(animal.name) && this.age == animal.age && this.species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age*37+species.hashCode();
    }
}
