package lesson_024_objectAndString.Hausaufgabe.transport;

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

        Transport t1 = null;
        boolean state = ride.getClass() == t1.getClass();
        System.out.println("Compare class of ride and t1 "+state);


    }
}
