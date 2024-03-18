package Temp_Hold.lesson_022_class_relation.transport;

public class Bus extends Transport {


    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bus() {
        super("Ikarus",40);
        setWeight(5000);
        setTransportType("Bus");
    }

    public Bus(String name,int cap, int weight) {
        super(name,cap);
        setWeight(weight);
        setTransportType("Bus");
    }

    public String toString() {
        return getName()+" is a bus with passenger capacity of "+getPassengerCapacity()+" which is weights "+getWeight()+" kg without passengers.";
    }
}
