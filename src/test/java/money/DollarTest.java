package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Money five = new Dollar(5, "USD");
        assertEquals(new Dollar(10, "USD"), five.times(2));
        assertEquals(new Dollar(15, "USD"), five.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(new Dollar(5, "USD").equals(new Dollar(5, "USD")));
        assertFalse(new Dollar(5, "USD").equals(new Dollar(6, "USD")));
        assertTrue(new Franc(5, "CHF").equals(new Franc(5, "CHF")));
        assertFalse(new Franc(5, "CHF").equals(new Franc(6, "CHF")));
        assertFalse(new Dollar(5, "USD").equals(new Franc(5, "CHF")));
    }

    @Test
    void testMultiplicationFranc() {
        Money five = new Franc(5, "CHF");
        assertEquals(new Franc(10, "CHF"), five.times(2));
        assertEquals(new Franc(15, "CHF"), five.times(3));
    }

}
