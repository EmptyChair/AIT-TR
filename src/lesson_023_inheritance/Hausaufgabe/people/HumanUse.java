package lesson_023_inheritance.Hausaufgabe.people;

public class HumanUse {
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(h1.toString());
        h1.greet();
        h1.activity();

        Man peter = new Man("Peter", 25, "Warsteiner");
        System.out.println(peter.toString());
        peter.greet();
        peter.expropriateMobile();

        Woman anna = new Woman("Anna", 25,"blonde");
        System.out.println(anna.toString());
        anna.greet();
        anna.preen();

        Human[] humans = new Human[3];
        humans[0] = h1;
        humans[1] = peter;
        humans[2] = anna;
        for (Human x: humans) {
            System.out.println(x.toString()); //uses human/ male/female to String, as Overrides are still available
            x.greet();
            x.activity();
            // female function preen unavailable
            // male function expropriateMobile unavailable
            // both due to handling of objects as
        }





    }
}
