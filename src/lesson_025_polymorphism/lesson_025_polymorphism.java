package lesson_025_polymorphism;

import lesson_025_polymorphism.people.Human;
import lesson_025_polymorphism.people.Man;
import lesson_025_polymorphism.people.Woman;

//import java.util.Objects;

public class lesson_025_polymorphism {
    public static void main(String[] args) {
        Human h1 = new Human();
        Woman h2 = new Woman();
        Man h3 = new Man();

        //DIFFERENT SOUNDS DUE TO METHOD OVERRIDE IN MAN!
        h1.makeSound();
        h2.makeSound();
        h3.makeSound();

        h3.getFavoriteBeer();
        //THIS WILL NOT WORK!
        // h1.getFavoriteBeer();
        // h2.getFavoriteBeer();

        Human h1Man = new Man();
        //THIS WILL NOT WORK!
        // h1Man.setFavoriteBeer("Ohta");
        // h1Man.getFavoriteBeer();
        Man h2Man = (Man) h1Man;
        h2Man.setFavoriteBeer("Ohta");
        System.out.println("H2Man beer is "+h2Man.getFavoriteBeer());

        Human[] array1 = { new Human(), new Woman(), new Man()};

        for (Human x : array1) {
            x.makeSound();
            //Trying to get Man-exclusive fields from Human array won't work!!!
            //System.out.println("Give h5 "+array[2].getFavoriteBeer());

        }

        for (Human x : array1) {
            x.makeSound();
            if  (x.getClass() == Man.class) {
                //Update the Man in Human array to actual Man to use Man Methods
                Man h5 = (Man) array1[2];
                System.out.println("Give h5 "+h5.getFavoriteBeer());

            }
        }

        Human tolik = new Man("Tolik",23,"Bud");
        //FAIL! Can't get Tolik's beet without re-definition
        //System.out.println("Tolik's beer is "+tolik.getFavoriteBeer());
        Man tolikMan = (Man) tolik;
        System.out.println("Tolik's beer is "+tolikMan.getFavoriteBeer());

        Object[] array = new Object[6];
        array[0] = new Man();
        array[1] = new Human();
        array[2] = new Woman();
        array[3] = new Man();
        array[4] = new Human();
        array[5] = new Woman("Iza", 36,"blonde");

        for (Object obj : array) {
            System.out.println(obj.hashCode());

        }
        //REQUIRES equals Method OVERRIDE in HUMAN/MAN class
        if (array[0].equals(array[3])) {
            System.out.println("0 and 3 are equal");
        }


    }
}
