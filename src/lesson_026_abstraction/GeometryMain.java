package lesson_026_abstraction;

import lesson_026_abstraction.Geometry.*;

public class GeometryMain {
    public static void main(String[] args) {

        Circle s1 = new Circle();
        s1.showInfo();
        Circle s2 = new Circle(2.85);
        s2.showInfo();

        Eclipse e1 = new Eclipse();
        e1.showInfo();
        Eclipse e2 = new Eclipse(2.85, 3);
        e2.showInfo();

        Square sq1 = new Square();
        sq1.showInfo();
        Square sq2 = new Square(10);
        sq2.showInfo();

        Rechtangle rt1 = new Rechtangle();
        rt1.showInfo();
        Rechtangle rt2 = new Rechtangle(10,9);
        rt2.showInfo();

        Parallelogram pl1 = new Parallelogram();
        pl1.showInfo();
        Parallelogram pl2 = new Parallelogram(10,9,3);
        pl2.showInfo();


        System.out.println("Let's test an Array of shapes by creating 5 squares");
        GeometricShapeArray bigArray = new GeometricShapeArray();
        for (int i = 1; i< 6; i++ ) {
            Square variableSquare = new Square(i);
            bigArray.add(variableSquare);
        }
        System.out.println("Let's show Array of squares :");
        bigArray.showArrayList();
        System.out.println("Let's add a default Rechtangle :");
        Rechtangle defR = new Rechtangle();
        bigArray.add(defR);
        System.out.println("Let's show Array of squares with teh Rechtangle:");
        bigArray.showArrayList();

        System.out.println("Let's remove  element with index 10:");
        bigArray.remove(10);
        System.out.println("Let's remove  element with index 2:");
        bigArray.remove(2);
        System.out.println("Let's show the Array again:");
        bigArray.showArrayList();
        System.out.println("Let's remove  element with index 3:");
        bigArray.remove(3);
        System.out.println("Let's show the Array again:");
        bigArray.showArrayList();
        System.out.println("Let's remove  element with index 4:");
        bigArray.remove(4);
        System.out.println("Let's show the list again :");
        bigArray.showArrayList();
        System.out.println("Let's remove  element with index 0:");
        bigArray.remove(0);
        System.out.println("Let's remove  element with index 0:");
        bigArray.remove(0);



        System.out.println("Let's add a circle :");
        bigArray.add(s1);
        System.out.println("Let's add an eclipse :");
        bigArray.add(e1);
        System.out.println("Let's add a parallelogram :");
        bigArray.add(pl1);
        System.out.println("Let's show the list again :");
        bigArray.showArrayList();



    }
}
