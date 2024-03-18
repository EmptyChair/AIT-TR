package Temp_Hold.lesson_026_abstraction.Geometry;

abstract class GeometricShape {

    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    GeometricShape(String shape) {
        this.shape = shape;
    }

    // Methods: Perimeter, overall Area,

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract void showInfo();

}
