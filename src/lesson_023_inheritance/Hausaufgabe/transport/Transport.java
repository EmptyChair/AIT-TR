package lesson_023_inheritance.Hausaufgabe.transport;

public class Transport {
    protected String name;
    protected int passengerCapacity;

    protected String transportType;

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Transport () {
        setName("Strange Trsansport");
        setPassengerCapacity(2);
        setTransportType("unclear");
    }

    public Transport (String name, int a) {
        setName(name);
        setPassengerCapacity(a);
        setTransportType("unclear");
    }

    public String toString() {
        String a = new String(getName()+" is a transport of an unknown type which has capacity of "+getPassengerCapacity()+" .");
        return a;
    }

    public void honk() {
        System.out.println("HONK-HONK");
    }
}
