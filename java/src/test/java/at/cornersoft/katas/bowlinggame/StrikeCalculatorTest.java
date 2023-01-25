package at.cornersoft.katas.bowlinggame;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikeCalculatorTest{
    @Test
    void calculateTest() {
        StrikeCalculator strikeCalculator = new StrikeCalculator("X11111");
        int sum = strikeCalculator.calculate(0);
        assertEquals(12, sum);
    }
}
