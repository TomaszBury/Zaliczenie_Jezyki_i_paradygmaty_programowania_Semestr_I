package Zad_3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class zad3Test {
    @Test
    public void testBMI() {
        // Test case 1: BMI 
        double height = 1.70;
        double weight = 70;
        assertEquals(24.2, zad3.calculateBMI(weight, height), 0.2);

        // Test case 2: BMI 
        double height2 = 1.7;
        double weight2 = 90;
        double expected = 31.1;
        assertEquals(expected, zad3.calculateBMI(weight2, height2), 0.2);
        
        // Test case 3: BMI 
        double height3 = 1.70;
        double weight3 = 50;
        double expected3 = 17.3;
        assertEquals(expected3, zad3.calculateBMI(weight3, height3), 0.2);

        // Test case 4: BMI 
        double height4 = 1.70;
        double weight4 = 100;
        double expected4 = 34.6;
        assertEquals(expected4, zad3.calculateBMI(weight4, height4), 0.2);

        // Test case 5: BMI 
        double BMI5 = 34.6;
        String expected5 = "Obesity";
        assertEquals(expected5, zad3.categoriesBMI(BMI5));

        // Test case 6: BMI 
        double BMI6 = 29.8;
        String expected6 = "Overweight";
        assertEquals(expected6, zad3.categoriesBMI(BMI6));

        // Test case 7: BMI 
        double BMI7 = 18.4;
        String expected7 = "Underweight";
        assertEquals(expected7, zad3.categoriesBMI(BMI7));

        // Test case 8: BMI 
        double BMI8 = 20;
        String expected8 = "Normal";
        assertEquals(expected8, zad3.categoriesBMI(BMI8));
    }
    
}
