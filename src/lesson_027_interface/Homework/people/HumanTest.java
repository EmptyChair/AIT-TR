package lesson_027_interface.Homework.people;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HumanTest {

    static Human h1;
    static Human h2;
    static Human volodya;
    static Human anna;

    @BeforeAll
    public static void setUp(){
        h1 = new Human();
        h2 = new Human();
        volodya = new Human("volodya",25);
        volodya.setGender("male");
        anna = new Human("anna",20);
        anna.setGender("female");
    }

    @Test
    public void equalsTest() {
        System.out.println("Testing equals... ");
        Assertions.assertTrue(h1.equals(h1),"H1 should equal itself");
        Assertions.assertFalse(h1.equals(null),"H1 should NOT equal null");
        Assertions.assertTrue(anna.equals(anna),"Anna should equal itself");
        Assertions.assertFalse(anna.equals(volodya),"Anna should NOT equal Volodya");
        Assertions.assertFalse(volodya.equals(anna),"Volodya should NOT equal Anna");
    }
    @Test
    public void hashCodeTest() {
        System.out.println("Testing Hashcode... ");
        Assertions.assertEquals(anna.hashCode(), anna.name.hashCode()+anna.age*31+anna.gender.hashCode(),
                "Anna's hashcode formula should work");
        Assertions.assertEquals(h1.hashCode(), h1.name.hashCode()+h1.age*31+h1.gender.hashCode(),
                "H1's hashcode formula should work");
        Assertions.assertEquals(volodya.hashCode(), volodya.hashCode(),
                "Volodya's hashcode should equal itself");
        Assertions.assertNotEquals(volodya.hashCode(), anna.hashCode(),
                "Volodya's hashcode should NOT equal Anna's");
        Assertions.assertNotEquals(anna.hashCode(), h1.hashCode(),
                "Anna's hashcode should NOT equal H1's");
    }
}
