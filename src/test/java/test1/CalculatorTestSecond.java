package test1;

import Calculator.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTestSecond {

    private Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
        System.out.println("Before Method");
    }

    @Test
    public void TestSubtract() throws InterruptedException {
        int some1 = 100, some2 = 25;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }
}
