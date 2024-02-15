package lesson_022_class_relation.animal;

public class Cow extends Animal {

    private double milkDaily;


    public double getMilkDaily() {
        return milkDaily;
    }

    public void setMilkDaily(double milkDaily) {
        this.milkDaily = milkDaily;
    }

    public Cow() {
        setName("Murka");
        setAge(3);
        setMilkDaily(5.05);
        setSpecies("Cow");
    }

    public Cow(String name, int age, double milkDaily) {
        super(name,age);
        setMilkDaily(milkDaily);
        setSpecies("Cow");
    }

    public String toString() {
        String a = new String(getName()+" is a cow which is "+getAge()+" years old. She produces "+getMilkDaily()+" liters of milk per day.");
        return a;
    }
}
