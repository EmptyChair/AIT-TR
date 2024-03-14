package consultation_24_03_11;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Position p = new Position(4,5);
        System.out.println(p);
        p.move(6,Directions.LEFT);
        System.out.println(p);
        p.move(4,Directions.UP);
        System.out.println(p);
        p.move(2,Directions.DOWN);
        System.out.println(p);
        p.move(1,Directions.valueOf("RIGHT")); //case sensitive
        System.out.println(p);
        Directions[] array = Directions.values();
        System.out.println(array);
    }
}
