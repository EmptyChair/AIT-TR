package Temp_Hold.lesson_022_class_relation.animal;

public class Dog extends Animal {

    private boolean loyalty;

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
}
