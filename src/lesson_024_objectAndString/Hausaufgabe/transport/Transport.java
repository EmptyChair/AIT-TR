package lesson_024_objectAndString.Hausaufgabe.transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Transport transport = (Transport) obj;
        return this.passengerCapacity == transport.passengerCapacity && this.name.equals(transport.name) && Objects.equals(this.transportType, transport.transportType);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.passengerCapacity*31+this.transportType.hashCode();
    }
}
