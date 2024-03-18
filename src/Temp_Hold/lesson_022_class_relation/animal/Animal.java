package Temp_Hold.lesson_022_class_relation.animal;

public class Animal {
    private String name;
    private int age;

    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

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

    //Constructors
    public Animal() {
        setName("A Mystery Animal");
        setAge(1);
        setSpecies("unknown");
    }

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
        setSpecies("unknown");
    }

    //to String
    public String toString() {
        String a = new String(getName()+" is an animal of unknown species which is "+getAge()+" years old.");
        return a;
    }

}
