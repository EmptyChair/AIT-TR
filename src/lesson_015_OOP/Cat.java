package lesson_015_OOP;

//This file declares class "Cat" with it attendant attributes and
public class Cat {
    // Description how the object is
    String color;
    int age;
    String name;
    static int legsCount = 4;
    boolean hungry;

    //Methods show what an object of this calss can do
    public void sayMeow() {
        System.out.println("Meow");
    }

    public void isHungry() {
        if (hungry) {
            System.out.println(name+" is hungry and miserable!");
        } else {
            System.out.println(name+" is sated and happy!");
        }
    }

    public void feedCat () {
        this.hungry = false;
    }

    public static void info () {
        System.out.println("All cats want to eat.");
    }
}
