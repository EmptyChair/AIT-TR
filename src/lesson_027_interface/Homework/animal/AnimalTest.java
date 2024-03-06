package lesson_027_interface.Homework.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    //Animals are class attributes
    static Animal def1;
    static Animal def2;
    static Animal cheb;
    static Animal gena;
    static Animal null1;
    static Animal null2;
    static Animal def3;

    private Animal animal5;

    @BeforeAll
    public static void setUpClass() {
        def1 = new Animal();
        def2 = new Animal();
        cheb = new Animal("Cheburashka",15);
        gena = new Animal("Gena",15);
        null1 = null;
        null2 = null;
        def3 = new Animal("A Mystery Animal",1);
    }

    @BeforeEach
    public void setUp() {
        this.animal5 = new Animal();
    }

    @Test
    public void compareObjectNull() {
        System.out.println("Testing Null Comparisons... ");
        Assertions.assertFalse(cheb.equals(null1),"Cheburashka should not equal null");
        Assertions.assertFalse(def1.equals(null1),"Defalt1 animaö should not equal null");
        //NOT ALLOWED TO APPLY METHOD TO NULL!!!
        //Assertions.assertFalse(null1.equals(cheb),"Null should not equal Cheburashka");
        //Assertions.assertTrue(null1.equals(null2),"But Null should equal null");
    }

    @Test
    public void compareObjectEqual() {
        System.out.println("Testing Object Comparisons... ");
        Assertions.assertTrue(cheb.equals(cheb),"Cheburashka should equal itself");
        Assertions.assertTrue(def1.equals(def2),"Two default animals should be equals");
        Assertions.assertTrue(def2.equals(def1),"In both directions");
        Assertions.assertFalse(cheb.equals(gena),"Cheburashka should not equal Gena");
        Assertions.assertFalse(gena.equals(cheb),"Nor Gena - Cheburashka");
    }

    @Test
    public void testHashCode() {
        System.out.println("Testing Object Comparisons... ");
        Assertions.assertEquals(cheb.name.hashCode()+cheb.age*37+cheb.species.hashCode(), cheb.hashCode(),
                "Cheburashka's hashcode should provide the same result as its formula");
        Assertions.assertEquals(def1.hashCode(), def2.hashCode(),
                "Def1 and Def2 should have the same Hashcode");
        Assertions.assertEquals(animal5.hashCode(), def2.hashCode(),
                "Animal5 and Def1 should have the same Hashcode");
        Assertions.assertEquals(def2.hashCode(), animal5.hashCode(),
                "Def1 and Animal5 should have the same Hashcode");
    }

    @Test
    public void testConstructor() {
        //def1 is default constructor object
        //def3 has the same values as default constructor object
        Assertions.assertEquals(def1.hashCode(), def3.hashCode(),
                "Def1 and Def3 should have the same Hashcode");
        Assertions.assertTrue(def1.equals(def3),
                "Def1 and Def3 should be equals");
        Assertions.assertTrue(def3.equals(def1),
                "Def1 and Def3 should be equals");
        Assertions.assertEquals("Cheburashka", cheb.getName(),
                "Cheburashka's name should be Chebirashka");
        Assertions.assertEquals(15, cheb.getAge(),
                "Cheburashka's age should be 15");
    }


}
