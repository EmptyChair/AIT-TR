package Temp_Hold.lesson_026_abstraction.Geometry;

public class Square extends GeometricShape {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square() {
        super("square");
        this.a = 5;
    }
    public Square(double a) {
        super("square");
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*this.a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public void showInfo() {
        System.out.println("This is a "+getShape());
        System.out.println("It has a side of "+getA()+" cm, a perimeter of "+calculatePerimeter()+" cm and an area of "+calculateArea()+" cm².");
    }

}
