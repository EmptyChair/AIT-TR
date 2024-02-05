package Lesson_015_OOP;

public class Lesson_015_CatMain {
    public static void main(String[] args) {
        //declare cats cat1, cat2, cat3 and provide them with attributes
        Cat cat1 = new Cat();
        cat1.color = "black";
        cat1.age = 10;
        cat1.name = "Barsik";
        cat1.hungry = true;

        Cat cat2 = new Cat();
        cat2.color = "white";
        cat2.age = 5;
        cat2.name = "Marik";
        cat2.hungry = true;

        Cat cat3 = new Cat();
        cat3.color = "red";
        cat3.age = 1;
        cat3.name = "Elk";
        cat3.hungry = true;

        //Grab attributes of individual cats
        System.out.println("Color of cat1 "+ cat1.color);
        System.out.println("Age of cat1 "+ cat1.age);
        System.out.println("Name of cat1 "+ cat1.name);
        System.out.println("Color of cat2 "+ cat2.color);
        System.out.println("Color of cat3 "+ cat3.color);

        //Summon meow function for each cat
        System.out.println("Let all cats meow!");
        cat1.sayMeow();
        cat2.sayMeow();
        cat3.sayMeow();

        //Leg count is also static (class-wide, not object-wide) attribute
        System.out.println("Cats have "+Cat.legsCount+" legs.");
        //apply 5 to the static attribute - it changes for all "cat" objects
        System.out.println("Cat 1 has "+cat1.legsCount+" legs.");
        System.out.println("Cat 2 has "+cat2.legsCount+" legs.");
        cat1.legsCount = 5;
        System.out.println("Changing leg count of cat1 to 5");
        //legs count will change for all cats since it is a static variable
        System.out.println("Cat 1 has "+cat1.legsCount+" legs.");
        System.out.println("Cat 2 has "+cat2.legsCount+" legs.");

        //Static attributes: info method tells us all cats like to it, it's a class-wide thing
        Cat.info();

        //Checking if cats are hungry
        System.out.println("Are cats fed?");
        cat1.isHungry();
        cat2.isHungry();
        cat3.isHungry();
        System.out.println("Feed cat1.");
        cat1.feedCat();
        System.out.println("Are cats fed?");
        cat1.isHungry();
        cat2.isHungry();
        cat3.isHungry();

    }
}
