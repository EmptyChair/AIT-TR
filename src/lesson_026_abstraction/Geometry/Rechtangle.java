package lesson_026_abstraction.Geometry;

public class Rechtangle extends GeometricShape {

    private double a;

    private double b;

    /*
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

     */

    public Rechtangle () {
        super("rechtagle");
        this.a = 1;
        this.b = 3;
    }

    public Rechtangle (double a, double b) {
        super("rechtagle");
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return a+a+b+b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public void showInfo() {
        System.out.println("This is a "+getShape());
        System.out.println("It has a side  of "+this.a+" cm, another of "+this.b+" cm, a perimeter of "+calculatePerimeter()+" cm and an area of "+calculateArea()+" cm².");
    }
}
