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
                .add(BigDecimal.valueOf(4631.04));
        BigDecimal tax2 = zad4.taxCalculation(income2);
        int comp2 = expectedTax2.compareTo(tax2);
        assertEquals(0, comp2);

        // Test case 3: tax free
        BigDecimal income3 = BigDecimal.valueOf(3089);
        int comp3 = BigDecimal.ZERO.compareTo(zad4.taxCalculation(income3));
        assertEquals(0, comp3);

        // Test case 4: zero income
        BigDecimal income4 = BigDecimal.ZERO;
        int comp4 = BigDecimal.ZERO.compareTo(zad4.taxCalculation(income4));
        assertEquals(0, comp4);

        
        // Add more test cases as needed
    }
}
