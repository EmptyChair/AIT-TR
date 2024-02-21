package lesson_027_interface;

public interface Drawable {
    void print();

    default void resize() {
        System.out.println("Changing size...");
    }
}

class Circle implements Drawable {

    @Override
    public void print() {
        System.out.println("Draw circle");
        System.out.println("    *     ");
        System.out.println("  *    *   ");
        System.out.println(" *      * ");
        System.out.println("  *     *  ");
        System.out.println("   *   *   ");
        System.out.println("     *     ");

    }
}

class Square implements Drawable {

    Square() {

    }
    @Override
        public void print() {
        System.out.println("Draw square");
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
    }

    @Override
    public void resize() {
        System.out.println("There is no resizing a square...");
    }
}
