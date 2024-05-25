import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;


public class TaxCalculationTest {

    @Test
    public void testTaxCalculation() {
        // Test case 1: Income below the first bracket
        BigDecimal income1 = BigDecimal.valueOf(50000);
        BigDecimal expectedTax1 = income1.multiply(BigDecimal.valueOf(0.18))
                .subtract(BigDecimal.valueOf(556.02));
        assertEquals(expectedTax1, zad4.taxCalculation(income1));

        // Test case 2: Income above the first bracket
        BigDecimal income2 = BigDecimal.valueOf(100000);
        BigDecimal expectedTax2 = BigDecimal.valueOf(14839.02)
                .add(income2.subtract(BigDecimal.valueOf(85528))
                .multiply(BigDecimal.valueOf(0.32)))
                .subtract(BigDecimal.valueOf(556.02));
        assertEquals(expectedTax2, zad4.taxCalculation(income2));

        // Add more test cases as needed
    }
}
