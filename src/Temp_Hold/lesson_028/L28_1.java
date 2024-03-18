package Temp_Hold.lesson_028;


public class L28_1 {
    public static void main(String[] args) {
        Car.Garage garage = new Car.Garage("Karl");
        Car car1 = new Car("audi", 1978);
        if (garage.checkColor("Red")) {
            System.out.println("The right color");
        } else {
            System.out.println("The wrong color");
        }


    }
}


class Car {
    static String color = "Blue";
    private int year;
    String name;
    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    static class Garage {

        String owner;
        Garage(String owner) {
            this.owner = owner;
        }

        // is it all the same color?
        boolean checkColor(String color) {
            return Car.color.equals(color);

        }
    }

}
