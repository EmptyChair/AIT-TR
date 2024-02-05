package Lesson_015_OOP;

public class Human {
    //attributes
    int age;
    boolean emp;
    String name;

    //constructor - no data provided
    Human () {
        this.age = 18;
        this.emp = true;
        this.name = "Anon";
    }

    //constructor - full set
    Human (int age, boolean emp, String name) {
        this.age = age;
        this.emp = emp;
        this.name = name;
    }

    //constructor - name only
    Human (String name) {

        this(); //creates default human
        // applies new name to default human
        this.name = name;
    }

}
