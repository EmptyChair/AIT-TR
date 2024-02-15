package lesson_022_class_relation;

import lesson_022_class_relation.people.Human;
import lesson_022_class_relation.people.Man;
import lesson_022_class_relation.people.Woman;
import lesson_022_class_relation.transport.Transport;
import lesson_022_class_relation.transport.Car;
import lesson_022_class_relation.transport.Bus;
import lesson_022_class_relation.transport.Bike;
import lesson_022_class_relation.animal.Animal;
import lesson_022_class_relation.animal.Cat;
import lesson_022_class_relation.animal.Cow;
import lesson_022_class_relation.animal.Dog;


//CLASS INHERITANCE TEST
public class L22Main {
    public static void main(String[] args) {

            Human h1 = new Human();
            Human h2 = new Human("Ugly Slob",45);
            System.out.println(h1);
            System.out.println(h2);

            Man m1 = new Man();
            Man m2 = new Man("Karl", 30, "Baltika");
            System.out.println(m1);
            System.out.println(m2);

            Woman w1 = new Woman();
            Woman w2 = new Woman("Yulia", 30, "blonde");
            System.out.println(w1);
            System.out.println(w2);

            Transport t1 = new Transport();
            Transport t2 = new Transport("Wagen",4);
            System.out.println(t1);
            System.out.println(t2);

            Car c1 = new Car();
            Car c2 = new Car("Wagen", 4,true);
            System.out.println(c1);
            System.out.println(c2);

            Bike b1 = new Bike();
            Bike b2 = new Bike("Roller", 3,3);
            System.out.println(b1);
            System.out.println(b2);

            Bus bus1 = new Bus();
            Bus bus2 = new Bus("MAZ", 30,6000);
            System.out.println(bus1);
            System.out.println(bus2);

            Animal a1 = new Animal();
            Animal a2 = new Animal("Cryptid", 6000);
            System.out.println(a1);
            System.out.println(a2);

            Cat cat1 = new Cat();
            Cat cat2 = new Cat("Murzilka", 4,5);
            System.out.println(cat1);
            System.out.println(cat2);

            Cow cow1 = new Cow();
            Cow cow2 = new Cow("Buryonka", 4,5.5);
            System.out.println(cow1);
            System.out.println(cow2);

            Dog d1 = new Dog();
            Dog d2 = new Dog("Bobikin", 4,true);
            Dog d3 = new Dog("Zeka", 4,false);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);



    }
}
