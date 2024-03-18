package Temp_Hold.lesson_023_inheritance.Hausaufgabe.transport;

public class Bus extends Transport {


    protected int weight;

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

    @Override
    public String toString() {
        return getName()+" is a bus with passenger capacity of "+getPassengerCapacity()+" which is weights "+getWeight()+" kg without passengers.";
    }

    @Override
    public void honk() {
        System.out.println("BAAAAAAAAAAAH!!!");
    }
}
