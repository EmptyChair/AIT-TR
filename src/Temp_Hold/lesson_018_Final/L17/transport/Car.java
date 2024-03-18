package Temp_Hold.lesson_018_Final.L17.transport;

public class Car {

    private String Name;
    private int seats;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car () {
        setName("VAZ");
        setSeats(4);
    }

    public Car (String name, int seats) {
        setName(name);
        setSeats(seats);
    }

    public String toString() {
        return getName()+" is a car which has "+getSeats()+" seats.";
    }
}

