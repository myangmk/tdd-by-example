package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {


    @Test
    void testCurrency() {
        assertEquals("USD", new Dollar(1, "USD").currency());
        assertEquals("CHF", new Franc(1, "CHF").currency());
    }

    @Test
    void testDifferentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
    }
}
