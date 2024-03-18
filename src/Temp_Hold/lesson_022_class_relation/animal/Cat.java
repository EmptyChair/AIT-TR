package Temp_Hold.lesson_022_class_relation.animal;

public class Cat extends Animal {


    private int paws;


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

    //to String
    public String toString() {
        String a = new String(getName()+" is a cat which is "+getAge()+" years old, with "+getPaws()+" paws.");
        return a;
    }

}
