package lesson_024_objectAndString.Hausaufgabe.animal;

public class Cat extends Animal {


    protected int paws;


    // GETTERS SETTERS


    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }



    //Constructors
    public Cat() {
        super("Barsik",1);
        setPaws(4);
        setSpecies("Cat");
    }

    public Cat(String name, int paws, int age) {
        super(name,age);
        setPaws(paws);
        setSpecies("Cat");
    }

    @Override
    //to String
    public String toString() {
        String a = new String(getName()+" is a cat which is "+getAge()+" years old, with "+getPaws()+" paws.");
        return a;
    }

    @Override
    public void walk() {
        System.out.println("The cat is pattering softly, destination unknown...");
    }

}
