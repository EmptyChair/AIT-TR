package lesson_017_Incapsulation.L17.people;

public class Man {
    private String name;
    private int age;

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

    public Man() {
        setName("John Doe");
        setAge(18);
    }

    public Man(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String toString() {
        String a = new String(getName()+" is a man who is "+getAge()+" years old.");
        return a;
    }
}
