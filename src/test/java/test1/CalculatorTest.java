package test1;

import Calculator.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
        System.out.println("Before Method");
    }

    @Test(description = "First test")
    public void addTest() {
        int some1 = 11, some2 = 14;
        int expectedResult = 25;
        int actualResult = calculator.add(some1, some2);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult, "Addition failed");
    }
}
