package Temp_Hold.lesson_018_Final;

import Temp_Hold.lesson_017_Incapsulation.L17.people.Man;

public class Lesson_018_Final {
    public static void main(String[] args) {
        //FINAL variables won't
        final double PI = 1.235;

        //FINAL Variable which won't
        final double PI2;
        PI2 = 3.6465;

        //PI2 can not be initialized the second time
        //PI2 = 1;

        //if used on array (reference type), final means that the REFERENCE is immutable, but the DATA isn't
        final int[] array = new int[] {4,2,65,10};

        //This works, as only DATA is changed
        System.out.println(array[1]);
        array[1] = 10;
        System.out.println(array[1]);

        //this won't as the REFERENCE can not be changed
        //array = null;

        //Final class - we can change the data inside
        final Man karl;
        karl = new Man("Karlen",30);
        Man karl2 = new Man("Karlen",30);
        karl.setAge(35);

        //Final class - we can NOT change the reference by initializing the object anew
        // karl = new Man("Not Karlen", 32);

        //Assigning Karl1 as karl2 will also FAIL
        // karl = karl2;

        // Car test
        Car car1 = new Car();
        Car car2 = new Car(40, "Aston Martin");
        System.out.println(car1);
        System.out.println(car2);

        car1.go(10);
        car2.go(20);
        System.out.println(car1);
        System.out.println(car2);

        car1.refuel(5);
        System.out.println(car1);

        car1.go(15);
        car2.go(15);

        System.out.println(Car.getTotalDistanceOfAllCars()+" km has been driven by all our cars.");


    }
}
