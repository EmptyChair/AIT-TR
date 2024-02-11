package lesson_018_Final.L17.transport;

public class Bike {
    private String name;
    private int deadRiders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeadRiders() {
        return deadRiders;
    }

    public void setDeadRiders(int deadRiders) {
        this.deadRiders = deadRiders;
    }

    public Bike () {
        setName("Harley-Davidson");
        setDeadRiders(2);
    }

    public Bike (String name, int a) {
        setName(name);
        setDeadRiders(a);
    }

    public String toString() {
        String a = new String(getName()+" is a bike which is designed to get at least "+getDeadRiders()+" people killed.");
        return a;
    }
}
