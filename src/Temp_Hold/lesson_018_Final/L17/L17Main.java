package Temp_Hold.lesson_018_Final.L17;

import Temp_Hold.lesson_018_Final.L17.animal.Cat;
import Temp_Hold.lesson_018_Final.L17.animal.Cow;
import Temp_Hold.lesson_018_Final.L17.animal.Dog;
import Temp_Hold.lesson_018_Final.L17.people.Man;
import Temp_Hold.lesson_018_Final.L17.people.Woman;
import Temp_Hold.lesson_018_Final.L17.transport.Bike;
import Temp_Hold.lesson_018_Final.L17.transport.Bus;
import Temp_Hold.lesson_018_Final.L17.transport.Car;

public class L17Main {
    public static void main(String[] args) {
            Cat cat1 = new Cat();
            System.out.println(cat1);
            Cow cow1 = new Cow();
            System.out.println(cow1);
            Dog dog1 = new Dog("Sharik",5, true);
            System.out.println(dog1);

            Man karl = new Man("Karl", 99);
            System.out.println(karl);
            Woman w1 = new Woman("Lara", "blonde");
            System.out.println(w1);
            Woman w2 = new Woman();
            System.out.println(w2);

            Bike longbike = new Bike("Kulibin Industries 1980", 6);
            System.out.println(longbike);
            Bus b1 = new Bus();
            System.out.println(b1);
            Car aston = new Car("Aston Martin", 2);
            System.out.println(aston);
    }
}
