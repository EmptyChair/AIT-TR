package Temp_Hold.lesson_027_interface;

public class Reichtagle implements Drawable, GeometryShape {

    @Override
    public void celebrate() {
        System.out.println("GUTEN TAG!");
        System.out.println("ANSCHLUSS TIME!");
    }

    @Override
    public void print() {
        System.out.println("**********************");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*     **     **      *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*  ANSCHLUSS-ZEIT!!! *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("*                    *");
        System.out.println("**********************");
    }

}
