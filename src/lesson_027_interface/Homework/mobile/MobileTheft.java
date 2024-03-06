package lesson_027_interface.Homework.mobile;


public interface MobileTheft {
    default void acquireMobile(){
        System.out.println("Can't steal a mobile, alas...");
    };
}
