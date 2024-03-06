package lesson_027_interface.Homework.transport;

public class Bike extends Transport {

    protected int deadRiders;



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

    @Override
    public String toString() {
        String a = new String(getName()+" is a bike with passenger capacity of "+getPassengerCapacity()+" which is designed to get at least "+getDeadRiders()+" people killed.");
        return a;
    }

    @Override
    public void honk() {
        System.out.println("WROOOOM!!!");
    }


}
