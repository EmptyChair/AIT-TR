package lesson_027_interface.Homework.animal;

public class Dog extends Animal {

    protected boolean loyalty;

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }

    public Dog() {
        super("Mutt", 2);
        setLoyalty(false);
        setSpecies("Dog");
    }

    public Dog(String name, int age, boolean loyalty) {
        super(name,age);
        setLoyalty(loyalty);
        setSpecies("Dog");
    }

    public String toString() {
        String a = new String(getName()+" is a dog which is "+getAge()+" years old. Its loyalty is "+isLoyalty());
        return a;
    }

    @Override
    public void walk() {
        System.out.println("The dog runs to you! It's a good dog!");
    }

    @Override
    public void acquireMobile() {
        if (loyalty)
            System.out.println("The dog is too loyal to do something so base as to steal your mobile!");
        else
            System.out.println("The treasonous dog snatches your mobile in its jaws and runs away!");
    }
}
