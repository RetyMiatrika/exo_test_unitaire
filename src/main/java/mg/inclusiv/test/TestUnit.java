package mg.inclusiv.test;

import mg.inclusiv.calculator.Calculator;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class TestUnit {
    //Test de la fonctionnalité addition en positif, négatif et zéro
    @Test
    public void testAddition(){
        assertEquals(8, Calculator.addition(5,3));
        assertEquals((-8), Calculator.addition(-5,-3));
        assertEquals(0, Calculator.addition(0,0));

    }
    //Test de la fonctionnalité soustraction en positif, négatif et zéro
    @Test
    public void testSubstraction(){
        assertEquals(4, Calculator.substraction(7,3));
        assertEquals(-2, Calculator.substraction(-5,-3));
        assertEquals(0, Calculator.substraction(0,0));
    }

    //Test de la fonctionnalité multiplication en positif, négatif et zéro
    @Test
    public void testMultiplication (){
        assertEquals(72,Calculator.multiplication(8,9));
        assertEquals(-21,Calculator.multiplication(-3,7));
        assertEquals(0,Calculator.multiplication(7,0));
    }

    //Test de fonctionnalité division en positif, négatif, zéro et diviseur zéro
    @Test
    public void testDivision(){
    assertEquals(8.5,Calculator.division(34,4));
    assertEquals(-12.9,Calculator.division(-25.8,2));
    assertEquals(0.0,Calculator.division(0,54));
        try {
            Calculator.division(15.0, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }


    }
}
