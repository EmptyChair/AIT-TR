package lesson_022_class_relation.transport;

public class Bike extends Transport {

    private int deadRiders;



    public int getDeadRiders() {
        return deadRiders;
    }

    public void setDeadRiders(int deadRiders) {
        this.deadRiders = deadRiders;
    }

    public Bike () {
        super("Harley-Davidson",2);
        setDeadRiders(2);
        setTransportType("Bike");
    }

    public Bike (String name, int cap, int dr) {
        super(name, cap);
        setDeadRiders(dr);
        setTransportType("Bike");
    }

    public String toString() {
        String a = new String(getName()+" is a bike with passenger capacity of "+getPassengerCapacity()+" which is designed to get at least "+getDeadRiders()+" people killed.");
        return a;
    }
}
