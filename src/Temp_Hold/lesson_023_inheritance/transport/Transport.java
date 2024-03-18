package Temp_Hold.lesson_023_inheritance.transport;

public class Transport {

    //ATTRIBUTES

    private boolean autoTransmission;

    private int headlights;
    private String name;
    private int passengerCapacity;

    private int weight;

    private boolean breaks;

    private int speed;

    private String transportType;

    //SETTERS GETTERS

    public int getHeadlights() {
        return headlights;
    }

    public void setHeadlights(int headlights) {
        this.headlights = headlights;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBreaks() {
        return breaks;
    }

    public void setBreaks(boolean breaks) {
        this.breaks = breaks;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAutoTransmission() {
        return autoTransmission;
    }

    public void setAutoTransmission(boolean autoTransmission) {
        this.autoTransmission = autoTransmission;
    }

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

    // CONSTRUCTORS
    public Transport () {
        setName("Strange Transport");
        setPassengerCapacity(2);
        setTransportType("unclear");
        setWeight(2000);
        setBreaks(true);
        setSpeed(0);
        setAutoTransmission(false);
        setHeadlights(2);
    }

    public Transport (String name, int passengerCapacity, int weight, boolean breaks, int speed, boolean transm, int headlights) {
        setName(name);
        setPassengerCapacity(passengerCapacity);
        setTransportType("unclear");
        setWeight(1500);
        setBreaks(true);
        setSpeed(0);
        setAutoTransmission(false);
        setHeadlights(4);
    }

    public String toString() {
        String a = new String(getName()+" is a transport of an unknown type which has capacity of "+getPassengerCapacity()+", has "+getHeadlights()+" headlights and weights "+getWeight()+" kg. Does this transport have an automated transmission? "+isAutoTransmission()+"! Thought so. More importantly however, the transport has the current speed of "+getSpeed()+" and its breaks are"+isBreaks());
        return a;
    }
}
