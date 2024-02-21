package lesson_026_abstraction.Geometry;

public class Parallelogram extends GeometricShape {

    private double l;
    private double w;
    private double h;
    /*
    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

     */

    public Parallelogram() {
        super("parallelogram");
        this.l = 4;
        this.w = 5;
        this.h = 2;
    }

    public Parallelogram(double l, double w, double h) {
        super("parallelogram");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {
        return 2*this.l+2*this.w;
    }

    @Override
    public double calculateArea() {
        return this.l*this.h;
    }

    @Override
    public void showInfo() {
        System.out.println("This is a "+getShape());
        System.out.println("It has a length  of "+this.l+" cm, width of "+this.w+" cm, height of "+this.h+" cm, a perimeter of "+calculatePerimeter()+" cm and an area of "+calculateArea()+" cm².");
    }
}
