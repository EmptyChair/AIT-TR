package Temp_Hold.lesson_026_abstraction.Geometry;

public class Eclipse extends GeometricShape {
    private double widthR;
    private double lengthR;

    /*
    public double getWidthR() {
        return widthR;
    }

    public void setWidthR(double widthR) {
        this.widthR = widthR;
    }

    public double getLengthR() {
        return lengthR;
    }

    public void setLengthR(double lengthR) {
        this.lengthR = lengthR;
    }

     */

    public Eclipse() {
        super("Eclipse");
        this.lengthR = 2;
        this.widthR = 3;
    }

    public Eclipse(double a, double b) {
        super("Eclipse");
        this.lengthR = b;
        this.widthR = a;
    }

    @Override
    public double calculatePerimeter() {
        return 2*this.lengthR*this.widthR*Math.PI;
    }
    @Override
    public double calculateArea() {
        return Math.PI*this.widthR*this.lengthR;
    }
    @Override
    public void showInfo() {
        System.out.println("This is an eclipse");
        System.out.println("It has a meaurements of "+this.lengthR+" cm, "+this.widthR+" cm, a perimeter of "+calculatePerimeter()+" cm and an area of "+calculateArea()+" cm².");
    }
}
