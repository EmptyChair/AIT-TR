package lesson_024_objectAndString.Hausaufgabe.animal;

public class AnimalUse {
    public static void main(String[] args) {
        Animal chupakabra1 = new Animal("Plomk",25);
        System.out.println(chupakabra1.toString());
        chupakabra1.walk();

        Cat barsik = new Cat("Barsik",3,2);
        System.out.println(barsik.toString());
        barsik.walk();

        Cow murka = new Cow("Murka",5,2.39);
        System.out.println(murka.toString());
        murka.walk();

        Dog sharik = new Dog("Sharik",2,true);
        System.out.println(sharik.toString());
        sharik.walk();

        Animal[] animals = new Animal[4];
        animals[0] = barsik;
        animals[1] = murka;
        animals[2] = sharik;
        animals[3] = chupakabra1;

        for (Animal x : animals) {
            System.out.println(x.toString());
            x.walk();
        }

    }
}
