package Zad_5;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;

public class zad5ttest {
    @Test
    public void validatedInput() {
        // Test case 1: Stuff
        BigDecimal input1 = BigDecimal.valueOf(50000);
        String inputType1 = "stuff";
        Boolean expected1 = false;
        assertEquals(expected1, zad5.validatedInput(input1, inputType1));
        // Test case 1: Stuff
        BigDecimal input2 = BigDecimal.valueOf(500000);
        String inputType2 = "stuff";
        Boolean expected2 = false;
        assertEquals(expected2, zad5.validatedInput(input2, inputType2));

        // Test case 1: installmentPlan
        BigDecimal input3 = BigDecimal.valueOf(500000);
        String inputType3 = "installmentPlan";
        Boolean expected3 = false;
        assertEquals(expected3, zad5.validatedInput(input3, inputType3));

        // Test case 5: installmentPlan
        BigDecimal input4 = BigDecimal.valueOf(36);
        String inputType4 = "installmentPlan";
        Boolean expected4 = true;
        assertEquals(expected4, zad5.validatedInput(input4, inputType4));
    }
    
}
