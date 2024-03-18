package Temp_Hold.lesson_028;

public class L28_2 {

    public static void main(String[] args) {
        Car2 car = new Car2("Karl", 1993);
        Car2.Engine engine1 = car.new Engine();
        car.myEngine.makeSound();
        car.myEngine.start();


        //SAME EFFECT - ACCESS ENGINE METHODS DIRECTLY OR VIA CAR-CLASS!!!

        engine1.makeSound();
        engine1.start();

    }


}

class Car2 {
    private int year;
    String name;

    Engine myEngine;
    public Car2(String name, int year) {
        this.name = name;
        this.year = year;
        this.myEngine = new Engine();
    }

    class Engine {
        void makeSound() {
            System.out.println("VRROOOOOOM!!!");
        }

        void start() {
            System.out.println("Staring engine of "+Car2.this.name+"'s car... it's made in year "+year+" and sounds accordingly.");
        }
    }


}