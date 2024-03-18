package Temp_Hold.lesson_023_inheritance.Hausaufgabe.transport;

public class TransportUse {
    public static void main(String[] args) {
        Transport ride = new Transport();
        System.out.println(ride.toString());
        ride.honk();

        Bike harley = new Bike();
        System.out.println(harley.toString());
        harley.honk();

        Bus icarus = new Bus();
        System.out.println(icarus.toString());
        icarus.honk();

        Car volga = new Car();
        System.out.println(volga.toString());
        volga.honk(); //as it has no honk of its own, it uses Transport's honk

    }
}
