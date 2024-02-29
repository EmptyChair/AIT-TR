package lesson_032_Enum;

enum DayK {

    MONDAY,

    TUESDAY,

    WEDNESDAY,

    THURSDAY,

    FRIDAY,

    SATURDAY,

    SUNDAY

}







class DayNamesK {

    public static final DayNamesK MONDAY = new DayNamesK("MONDAY");

    public static final DayNamesK TUESDAY = new DayNamesK("TUESDAY");

    public static final DayNamesK WEDNESDAY = new DayNamesK("WEDNESDAY");

    public static final DayNamesK THURSDAY = new DayNamesK("THURSDAY");

    public static final DayNamesK FRIDAY = new DayNamesK("FRIDAY");

    public static final DayNamesK SATURDAY = new DayNamesK("SATURDAY");

    public static final DayNamesK SUNDAY = new DayNamesK("SUNDAY");



    // --------



    private final String dayName;



    DayNamesK(String dayName) {

        this.dayName = dayName;

    }



    @Override

    public String toString() {

        return this.dayName;

    }

}





class Main0 {

    public static void main(String[] args) {

        System.out.println(DayK.MONDAY);

        System.out.println(DayNamesK.THURSDAY);

        System.out.println(DayNamesK.THURSDAY == DayNamesK.THURSDAY);

    }

}









enum SeasonK {

    WINTER("Cold"),

    SPRING("Warm"),

    SUMMER("Hot"),

    AUTUMN("Cool");



    private final String description;



    SeasonK(String description) {

        this.description = description;

    }



    public String getDescription() {

        return description;

    }

}





class MySeasonK {

    public static final MySeasonK WINTER = new MySeasonK("WINTER", "Cold");

    public static final MySeasonK SPRING = new MySeasonK("SPRING", "Warm");

    public static final MySeasonK SUMMER = new MySeasonK("SUMMER", "Hot");

    public static final MySeasonK AUTUMN = new MySeasonK("AUTUMN", "Cool");



    private final String name;

    private final String description;



    MySeasonK(String name, String description) {

        this.name = name;

        this.description = description;

    }

}



/*

class Main {

    public static void main(String[] args) {

        handleDay(DayK.MONDAY);

        handleDay(DayK.THURSDAY);

        handleDay(DayK.SUNDAY);

    }



    public static void handleDayK(DayK day) {

        switch (day) {

            case MONDAY:

                System.out.println("Понедельник - начало недели.");

                break;

            case FRIDAY:

                System.out.println("Пятница - почти выходные!");

                break;

            case SUNDAY:

                System.out.println("Воскресенье - выходной день.");

                break;

            default:

                System.out.println("Средина недели.");

        }

    }

}





class Main2 {

    public static void main(String[] args) {

        for (Season season : Season.values()) {

            System.out.println(season + ": " + season.getDescription());

        }



        Season currentSeason = Season.SUMMER;



        if (currentSeason == Season.SUMMER) {

            System.out.println("It's hot outside!");

        }

    }


}

 */
