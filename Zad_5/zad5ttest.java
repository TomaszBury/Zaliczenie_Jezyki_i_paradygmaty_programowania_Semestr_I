package Zad_5;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;

public class zad5ttest {
    @Test
    public void validatedInput() {
        String inputTypePrincipal= "principal";
        String inputTypePlan = "installmentPlan";
        Boolean expectedTrue = true;
        Boolean expectedFalse = false;

        // Test case 1: Stuff
        BigDecimal input1 = BigDecimal.valueOf(50000);
        assertEquals(expectedFalse, zad5.validatedInput(input1, inputTypePrincipal));

        // Test case 0: Stuff
        BigDecimal input_zero = BigDecimal.valueOf(99);
        assertEquals(expectedFalse, zad5.validatedInput(input_zero, inputTypePrincipal));

        // Test case 1.1: principal
        BigDecimal input_low = BigDecimal.valueOf(111);
        assertEquals(expectedTrue, zad5.validatedInput(input_low, inputTypePrincipal));

        // Test case 1: Stuff
        BigDecimal input2 = BigDecimal.valueOf(500000);
        assertEquals(expectedFalse, zad5.validatedInput(input2, inputTypePrincipal));

        // Test case 1: installmentPlan
        BigDecimal input3 = BigDecimal.valueOf(500000);
        assertEquals(expectedFalse, zad5.validatedInput(input3, inputTypePlan));

        // Test case 5: installmentPlan
        BigDecimal input4 = BigDecimal.valueOf(36);
        assertEquals(expectedTrue, zad5.validatedInput(input4, inputTypePlan));
    }
    @Test
    public void interestRate() {
        // Test case 1: firs bucked.
        assertEquals(BigDecimal.valueOf(.025), zad5.rate(BigDecimal.valueOf(11)));

        // Test case 2: firs bucked.
        assertEquals(BigDecimal.valueOf(.025), zad5.rate(BigDecimal.valueOf(12)));

        // Test case 3: second bucked.
        assertEquals(BigDecimal.valueOf(.05), zad5.rate(BigDecimal.valueOf(24)));

        // Test case 4: third bucked.
        assertEquals(BigDecimal.valueOf(.1), zad5.rate(BigDecimal.valueOf(25)));
    }
}
