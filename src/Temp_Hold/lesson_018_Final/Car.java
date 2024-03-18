package Temp_Hold.lesson_018_Final;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private double fuelVolume=14;

    private String name;

    //Static variable owners

    private static String[] owners = new String[2];


    //Static variable shared by all

    public static double totalDistanceOfAllCars = 0;

    static {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter first owners name");
        owners[0] = s1.nextLine();
        System.out.println("Enter second owners name");
        owners[1] = s2.nextLine();
    }

    public static String[] getOwners() {
        return owners;
    }

    public static double getTotalDistanceOfAllCars() {
        return totalDistanceOfAllCars;
    }

    public static void setTotalDistanceOfAllCars(double totalDistanceOfAllCars) {
        Car.totalDistanceOfAllCars = totalDistanceOfAllCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    //constructor
    public Car () {
        setFuelVolume(20);
        setName("VAZ 6501");
    }

    public Car (int a, String b) {
        setFuelVolume(a);
        setName(b);
    }

    public void refuel (int l) {
        setFuelVolume(getFuelVolume()+l);
    }

    public void go(int distance) {
        setFuelVolume(getFuelVolume()-(double)distance*3/100);
        System.out.println(getName()+", owned by "+ Arrays.toString(getOwners())+" drove "+distance+" km.");
        setTotalDistanceOfAllCars(getTotalDistanceOfAllCars()+distance);
    }

    public String toString() {
        return getName()+", owned by "+ Arrays.toString(getOwners())+" has "+getFuelVolume()+" liters of fuel left. ";
    }


}
