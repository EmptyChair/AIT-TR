package Lesson_017_Incapsulation.L17.animal;

public class Cow {

    private String name;
    private int age;
    private double milkDaily;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
    }

    public Cow(String name, int age, double milkDaily) {
        setName(name);
        setAge(age);
        setMilkDaily(milkDaily);
    }

    public String toString() {
        String a = new String(getName()+" is a cow which is "+getAge()+" years old. She produces "+getMilkDaily()+" liters of milk per day.");
        return a;
    }
}
