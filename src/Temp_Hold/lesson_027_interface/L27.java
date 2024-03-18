package Temp_Hold.lesson_027_interface;

public class L27 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.print();
        Square s1 = new Square();
        s1.print();
        Reichtagle germany = new Reichtagle();
        germany.celebrate();
        germany.print();
        c1.resize();
        s1.resize();
        germany.resize();
    }
}
