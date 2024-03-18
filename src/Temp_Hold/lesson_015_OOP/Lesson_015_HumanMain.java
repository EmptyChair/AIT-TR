package Temp_Hold.lesson_015_OOP;

public class Lesson_015_HumanMain {
    public static void main(String[] args) {
        //h0, h1, h2 - object variables
        Human h0 = null;

        // Object creation - 3 humans
        // but there are 4 object variables (h0-h3) and 2 objects
        //h0 references null, no object
        //h1 references object
        //h2 and h3 reference the same object
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = h2;

        //setting parameters directly
        h1.age = 28;
        h1.name = "Maxim";
        h1.emp = false;

        //creating h2 via full constructor
        h2 = new Human(18,false,"Harry");
        //creating h3 via string-only constructor
        h3 = new Human("Bobby");

        //create an array of humans
        Human[] humans = new Human[5];
        humans[0] = h0;
        humans[1] = h1;
        humans[2] = h2;
        humans[3] = h3;
        humans[4] = new Human("Martinique");

        //System.out.println("Retrieve name of h0 "+h0.name);
        System.out.println("Retrieve age of h1 "+h1.age);
        System.out.println("Retrieve employment of h2 "+h2.emp);
        System.out.println("Retrieve age of h3 "+h3.age);
    }
}
