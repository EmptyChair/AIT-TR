package lesson_023_inheritance.Hausaufgabe.transport;

public class Car extends Transport {

    protected boolean boatHandle;


    public boolean isBoatHandle() {
        return boatHandle;
    }

    public void setBoatHandle(boolean boatHandle) {
        this.boatHandle = boatHandle;
    }

    public Car () {
        super("VAZ",4);
        setBoatHandle(false);
        setTransportType("Car");
    }

    public Car (String name, int seats, boolean boat) {
        super(name, seats);
        setBoatHandle(boat);
        setTransportType("Car");
    }

    @Override
    public String toString() {
        if (isBoatHandle()) {
            return getName()+" is a car with seats for "+getPassengerCapacity()+" passengers. It has a set of hooks to carry a boat.";
        } else {
            return getName()+" is a car with seats for "+getPassengerCapacity()+" passengers. It has no boat handles.";
        }
    }

}

