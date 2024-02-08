package Lesson_017_Incapsulation;

public class Dog {

    private int age;
    private String color;
    private String name;
    private double weight;
    private boolean isHungry;

    //GETTER for age parameter
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    // IMPORTANT: boolean retrieval method must be names isXXXX!!!!
    public boolean isHungry() {
        return this.isHungry;
    }

    //SETTER for age parameter
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHungry(boolean hungry) {
        this.isHungry = hungry;
    }

    //CONSTRUCTOR - no input

    public Dog () {
        setAge(1);
        setName("Nameless Mutt");
        setColor("black");
        setWeight(1.00);
        setHungry(true);
    }

    //CONSTRUCTOR - a dog with a name
    public Dog (String name) {
        setAge(1);
        setName(name);
        setColor("black");
        setWeight(1.00);
        setHungry(true);
    }

    //CONSTRUCTOR - a dog with everything
    public Dog (int age, String color, String name, double weight, boolean isHungry) {
        setAge(age);
        setName(name);
        setColor(color);
        setWeight(weight);
        setHungry(isHungry);
    }


    public void showDog() {
        System.out.println("DOG REPORT:");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Color: "+getColor());
        System.out.println("Weight: "+getWeight());
        if (isHungry()) {
            System.out.println("This one is very hungry!!!");
        } else {
            System.out.println("This one is well-fed and relaxed.");
        }

    }





}
