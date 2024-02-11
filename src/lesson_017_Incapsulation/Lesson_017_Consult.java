package lesson_017_Incapsulation;

import lesson_015_OOP.Cat;

// example hypothetical
// import de.aittr.shop.utils.Printer
// importing printer from utilities, shop app from AITTR company in Germany
public class Lesson_017_Consult {

    //testing import of classes
    public void test() {
        Cat cat1 = new Cat();
    }

    public static void main(String[] args) {

        //creates class Dog to work further

        Dog dog1 = new Dog();
        dog1.setAge(1);
        System.out.println("the Age of dog1 is "+dog1.getAge());

        Dog dog2 = new Dog();
        dog2.setAge(1);
        System.out.println("the Age of dog2 is "+dog2.getAge());

        Dog dog3 = new Dog();
        dog3.setAge(1);
        System.out.println("the Age of dog3 is "+dog3.getAge());

        Dog dog4 = new Dog(10,"white","Mutt the Elder",3.00, false);
        Dog dog5 = new Dog(3,"red","Not a Fox",3.00, true);

        dog4.showDog();
        dog5.showDog();




    }


}
