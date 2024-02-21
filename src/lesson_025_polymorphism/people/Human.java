package lesson_025_polymorphism.people;

import java.util.Objects;

public class Human {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(gender, human.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    private String name;
    private int age;

    private String gender;

    ///SETTERS GETTERS

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //CONSTRUCTORS
    public Human() {
        setName("Nameless One");
        setAge(18);
        setGender("unknown");
    }

    public Human(String name, int age) {
        setName(name);
        setAge(age);
        setGender("unknown");
    }

    public String toString() {
        String a = new String(getName()+" is a human of an unknown gender who is "+getAge()+" years old.");
        return a;
    }

    public void makeSound() {
        System.out.println("Hello!");
    }
}
