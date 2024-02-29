package lesson_032_Enum;

import java.util.Objects;

enum Day {
    MO,
    TU,
    WE,
    TH,
    FR,
    SA,
    SU
}

//TO COMPARE- REGULAR CLASS DOIN SAME

class DayNames {
    //why not static? is static
    public static final DayNames MONDAY = new DayNames(0);
    public static final DayNames TUESDAY = new DayNames(1);
    public static final DayNames WEDNESDAY = new DayNames(2);
    public static final DayNames THURSDAY = new DayNames(3);
    public static final DayNames FRIDAY = new DayNames(4);
    public static final DayNames SATURDAY = new DayNames(5);
    public static final DayNames SUNDAY = new DayNames(6);

    public int dayNumber;

    DayNames(int dayNumber) {
        this.dayNumber = dayNumber;

    }

    @Override
    public String toString() {
        return this.dayNumber+1+" day";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayNames dayNames = (DayNames) o;
        return dayNumber == dayNames.dayNumber && Objects.equals(MONDAY, dayNames.MONDAY) && Objects.equals(TUESDAY, dayNames.TUESDAY) && Objects.equals(WEDNESDAY, dayNames.WEDNESDAY) && Objects.equals(THURSDAY, dayNames.THURSDAY) && Objects.equals(FRIDAY, dayNames.FRIDAY) && Objects.equals(SATURDAY, dayNames.SATURDAY) && Objects.equals(SUNDAY, dayNames.SUNDAY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, dayNumber);
    }
}
public class L32 {
    public static void main(String[] args) {
        System.out.println(DayNames.MONDAY);
    }



}


