package Temp_Hold.lesson_018_Final.L17.transport;

public class Bus {

    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bus() {
        setName("Ikarus");
        setWeight(5000);
    }

    public Bus(String name, int weight) {
        setName(name);
        setWeight(weight);
    }

    public String toString() {
        return getName()+" is a bus which is weights "+getWeight()+" kg without passengers.";
    }
}
