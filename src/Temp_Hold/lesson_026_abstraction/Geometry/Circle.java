package Temp_Hold.lesson_026_abstraction.Geometry;

public class Circle extends GeometricShape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super("circle");
        this.radius = 5;
    }

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2*this.radius*Math.PI;
    }
    @Override
    public double calculateArea() {
        return Math.PI*this.radius*radius;
    }
    @Override
    public void showInfo() {
        System.out.println("This is a "+getShape());
        System.out.println("It has a radius of "+getRadius()+" cm, a perimeter of "+calculatePerimeter()+" cm and an area of "+calculateArea()+" cm².");
    }
}
