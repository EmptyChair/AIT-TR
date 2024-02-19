package lesson_023_inheritance.transport;

public class Car extends Transport {

    private boolean boatHandle;


    public boolean isBoatHandle() {
        return boatHandle;
    }

    public void setBoatHandle(boolean boatHandle) {
        this.boatHandle = boatHandle;
    }

    public Car () {
        super("VAZ",4, 2000, true, 0, true, 2);
        setBoatHandle(false);
        setTransportType("Car");
    }

    public Car (String name, int pc, int weight, boolean breaks, int speed, boolean trans, int hl, boolean boat) {
        super(name, pc, weight, breaks, speed, trans, hl);
        setBoatHandle(boat);
        setTransportType("Car");
    }

    public String toString() {
        if (isBoatHandle()) {
            return getName()+" is a car with seats for "+getPassengerCapacity()+" passengers. It has a set of hooks to carry a boat.";
        } else {
            return getName()+" is a car with seats for "+getPassengerCapacity()+" passengers. It has no boat handles.";
        }
    }

    //FUNCTIONS

    public void honk(int decibel) {

    }
}

