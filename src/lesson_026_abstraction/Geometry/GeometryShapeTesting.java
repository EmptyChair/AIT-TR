package lesson_026_abstraction.Geometry;

import lesson_026_abstraction.Geometry.GeometricShapeArray;
import lesson_026_abstraction.Geometry.GeometricShape;
import lesson_026_abstraction.Geometry.Circle;
import lesson_026_abstraction.Geometry.Eclipse;
import lesson_026_abstraction.Geometry.Parallelogram;
import lesson_026_abstraction.Geometry.Rechtangle;
import lesson_026_abstraction.Geometry.Square;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class GeometryShapeTesting {

    @BeforeAll
    public static void setUp() {
        GeometricShapeArray array = new GeometricShapeArray(5);
        Circle s2 = new Circle(2.85);
        Eclipse e2 = new Eclipse(2.85, 3);
        Square sq2 = new Square(10);
        Rechtangle rt2 = new Rechtangle(10,9);
        Parallelogram pl2 = new Parallelogram(10,9,3);
    }

    @Test
    public void testShapeArray() {
        GeometricShapeArray arrayX = new GeometricShapeArray();
        Assertions.assertEquals(5,arrayX.getArray().length);
        GeometricShapeArray array = new GeometricShapeArray(5);
        Circle s2 = new Circle(2.85);
        Eclipse e2 = new Eclipse(2.85, 3);
        Square sq2 = new Square(10);
        Rechtangle rt2 = new Rechtangle(10,9);
        Parallelogram pl2 = new Parallelogram(10,9,3);
        Assertions.assertEquals(null,array.getArray()[0]);
        array.add(s2);
        Assertions.assertEquals(1,array.getCount());
        array.resize();
        Assertions.assertEquals(6,array.getArray().length);
        array.add(e2);
        array.add(sq2);
        array.add(rt2);
        array.add(pl2);
        array.add(e2);
        array.add(sq2);
        array.remove(0);
        Assertions.assertEquals(e2,array.getArray()[0]);

    }

    @Test
    public void testSquare() {
        Square sq1 = new Square();
        Assertions.assertEquals(5,sq1.getA());
        Square sq2 = new Square(10);
        Assertions.assertEquals(100,sq2.calculateArea());
        Assertions.assertEquals(40,sq2.calculatePerimeter());
    }

    @Test
    public void testCircle() {
        Circle c1 = new Circle();
        Assertions.assertEquals(5,c1.getRadius());
        Circle c2 = new Circle(10);
        Assertions.assertEquals(Math.PI*10*10,c2.calculateArea());
        Assertions.assertEquals(Math.PI*20,c2.calculatePerimeter());
    }

    @Test
    public void testEclipse() {
        Eclipse c1 = new Eclipse();
        Eclipse c2 = new Eclipse(10,20);
        Assertions.assertEquals(Math.PI*10*20,c2.calculateArea());
        Assertions.assertEquals(2*10*20*Math.PI,c2.calculatePerimeter());
    }

    @Test
    public void testParallelogram() {
        Parallelogram c1 = new Parallelogram();
        Parallelogram c2 = new Parallelogram(10,20,5);
        Assertions.assertEquals(50,c2.calculateArea());
        Assertions.assertEquals(60,c2.calculatePerimeter());
    }

    @Test
    public void testRechtangle() {
        Rechtangle c1 = new Rechtangle();
        Rechtangle c2 = new Rechtangle(10,20);
        Assertions.assertEquals(200,c2.calculateArea());
        Assertions.assertEquals(60,c2.calculatePerimeter());
    }
















}
