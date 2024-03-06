package lesson_027_interface.Homework.transport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TransportTest {

    static Transport t1;
    static Transport t2;
    static Transport lada;
    static Transport volvo;

    @BeforeAll
    public static void setUp(){
        t1 = new Transport();
        t2 = new Transport();
        lada = new Transport("lada",4);
        lada.setTransportType("PKW");
        volvo = new Transport("volvo",2);
        volvo.setTransportType("Sportcar");
    }

    @Test
    public void equalsTest() {
        System.out.println("Testing equals... ");
        Assertions.assertTrue(t1.equals(t1),"T1 should equal itself");
        Assertions.assertFalse(t1.equals(null),"T1 should NOT equal null");
        Assertions.assertTrue(volvo.equals(volvo),"Volvo should equal itself");
        Assertions.assertFalse(volvo.equals(lada),"Volvo should NOT equal Lada");
        Assertions.assertFalse(lada.equals(volvo),"Lada should NOT equal Volvo");
    }
    @Test
    public void hashCodeTest() {
        System.out.println("Testing Hashcode... ");
        Assertions.assertEquals(volvo.hashCode(), volvo.name.hashCode()+volvo.passengerCapacity*31+volvo.transportType.hashCode(),
                "Volvo's hashcode formula should work");
        Assertions.assertEquals(t1.hashCode(), t1.name.hashCode()+t1.passengerCapacity*31+t1.transportType.hashCode(),
                "t1's hashcode formula should work");
        Assertions.assertEquals(lada.hashCode(), lada.hashCode(),
                "Lada's hashcode should equal itself");
        Assertions.assertNotEquals(volvo.hashCode(), lada.hashCode(),
                "Volvo's hashcode should NOT equal Lada's");
        Assertions.assertNotEquals(lada.hashCode(), volvo.hashCode(),
                "Lada's hashcode should NOT equal Volvo's");
    }
}
