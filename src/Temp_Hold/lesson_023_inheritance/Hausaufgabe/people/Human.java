package Temp_Hold.lesson_023_inheritance.Hausaufgabe.people;

public class Human {

    protected String name;
    protected int age;

    protected String gender;

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

    public void greet() {
        System.out.println("Hello.");
    }

    public void activity() {
        System.out.println("This person is doing something.");
        System.out.println("It's very suspicious.");
    }

}
