package lesson_018_Final.L17.animal;

public class Cat {

    private String name;
    private int paws;
    private int age;

    // GETTERS SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Constructors
    public Cat() {
        setName("Barsik");
        setPaws(4);
        setAge(1);
    }

    public Cat(String name, int paws, int age) {
        setName(name);
        setPaws(paws);
        setAge(age);
    }

    //to String
    public String toString() {
        String a = new String(getName()+" is a cat which is "+getAge()+" years old, with "+getPaws()+" paws.");
        return a;
    }

}
