package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Money five = new Money(5, "USD");
        assertEquals(new Money(10, "USD"), five.times(2));
        assertEquals(new Money(15, "USD"), five.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }

    @Test
    void testMultiplicationFranc() {
        Money five = new Money(5, "CHF");
        assertEquals(new Money(10, "CHF"), five.times(2));
        assertEquals(new Money(15, "CHF"), five.times(3));
    }

}
