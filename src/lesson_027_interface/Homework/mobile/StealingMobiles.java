package lesson_027_interface.Homework.mobile;

import lesson_027_interface.Homework.animal.Animal;
import lesson_027_interface.Homework.animal.Cat;
import lesson_027_interface.Homework.animal.Cow;
import lesson_027_interface.Homework.animal.Dog;
import lesson_027_interface.Homework.people.Human;
import lesson_027_interface.Homework.people.Man;
import lesson_027_interface.Homework.people.Woman;
import lesson_027_interface.Homework.transport.Bike;
import lesson_027_interface.Homework.transport.Bus;
import lesson_027_interface.Homework.transport.Car;
import lesson_027_interface.Homework.transport.Transport;

public class StealingMobiles {
    public static void main(String[] args) {
        Animal chupakabra1 = new Animal("Plomk",25);
        Cat barsik = new Cat("Barsik",3,2);
        Cow murka = new Cow("Murka",5,2.39);
        Dog sharik = new Dog("Sharik",2,true);
        Dog barbos = new Dog("Barbos",3,false);

        Human h1 = new Human();
        Man peter = new Man("Peter", 25, "Warsteiner");
        Woman anna = new Woman("Anna", 25,"blonde");
        Transport ride = new Transport();
        Bike harley = new Bike();
        Bus icarus = new Bus();
        Car volga = new Car();

        MobileThief[] collection = new MobileThief[10];
        collection[0] = chupakabra1;
        collection[1] = barsik;
        collection[2] = murka;
        collection[3] = h1;
        collection[4] = peter;
        collection[5] = ride;
        collection[6] = harley;
        collection[7] = anna;
        collection[8] = sharik;
        collection[9] = barbos;

        //testing stealing mobiles
        for (MobileThief x : collection) {
            x.acquireMobile();
        }
    }
}
