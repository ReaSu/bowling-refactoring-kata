package at.cornersoft.katas.bowlinggame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCalculatorTest {
    @Test
    void testCalculation() {
        DigitCalculator digitCalculator = new DigitCalculator("1111");

        int sum = digitCalculator.calculate(0);
        assertEquals(1, sum);
    }
}
