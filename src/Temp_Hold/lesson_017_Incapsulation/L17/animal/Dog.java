package Temp_Hold.lesson_017_Incapsulation.L17.animal;

public class Dog {
    private String name;
    private int age;
    private boolean loyalty;

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

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }

    public Dog() {
        setName("Mutt");
        setAge(2);
        setLoyalty(false);

    }

    public Dog(String name, int age, boolean loyalty) {
        setName(name);
        setAge(age);
        setLoyalty(loyalty);

    }

    public String toString() {
        String a = new String(getName()+" is a dog which is "+getAge()+" years old. Its loyalty is "+isLoyalty());
        return a;
    }
}
