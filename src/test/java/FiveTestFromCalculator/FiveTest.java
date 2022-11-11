package FiveTestFromCalculator;

import Calculator.Calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FiveTest {
    private Calculator calculator = new Calculator();

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @Test(groups = "fivetests")
    public void TestAdd() throws InstantiationException, InterruptedException {
        int some1 = 19, some2 = 31;
        int expectedResult = some1 + some2;
        int actualResult = (int) calculator.add(some1,some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestAdd2() throws InstantiationException, InterruptedException {
        int some1 = 1, some2 = 99;
        int expectedResult = some1 + some2;
        int actualResult = (int) calculator.add(some1,some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestAdd3() throws InstantiationException, InterruptedException {
        int some1 = 25, some2 = 75;
        int expectedResult = some1 + some2;
        int actualResult = (int) calculator.add(some1,some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestAdd4() throws InstantiationException, InterruptedException {
        int some1 = 2, some2 = 2;
        int expectedResult = some1 + some2;
        int actualResult = (int) calculator.add(some1,some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestAdd5() throws InstantiationException, InterruptedException {
        int some1 = 50, some2 = 50;
        int expectedResult = some1 + some2;
        int actualResult = (int) calculator.add(some1,some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract() throws InterruptedException {
        int some1 = 100, some2 = 25;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract2() throws InterruptedException {
        int some1 = 60, some2 = 33;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract3() throws InterruptedException {
        int some1 = 88, some2 = 22;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract4() throws InterruptedException {
        int some1 = 100, some2 = 99;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestSubtract5() throws InterruptedException {
        int some1 = 56, some2 = 1;
        int expectedResult = some1 - some2;
        float actualResult = calculator.substract(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply() throws InterruptedException {
        int some1 = 12, some2 = 2;
        int expectedResult = some1 * some2;
        int actualResult = calculator.multiply(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply2() throws InterruptedException {
        int some1 = 9, some2 = 8;
        int expectedResult = some1 * some2;
        int actualResult = calculator.multiply(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply3() throws InterruptedException {
        int some1 = 6, some2 = 5;
        int expectedResult = some1 * some2;
        int actualResult = calculator.multiply(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply4() throws InterruptedException {
        int some1 = 11, some2 = 3;
        int expectedResult = some1 * some2;
        int actualResult = calculator.multiply(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiply5() throws InterruptedException {
        int some1 = 25, some2 = 4;
        int expectedResult = some1 * some2;
        int actualResult = calculator.multiply(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide() throws InterruptedException {
        int some1 = 30, some2 = 2;
        int expectedResult = some1 / some2;
        int actualResult = calculator.divide(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide2() throws InterruptedException {
        int some1 = 88, some2 = 2;
        int expectedResult = some1 / some2;
        int actualResult = calculator.divide(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide3() throws InterruptedException {
        int some1 = 99, some2 = 3;
        int expectedResult = some1 / some2;
        int actualResult = calculator.divide(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide4() throws InterruptedException {
        int some1 = 100, some2 = 4;
        int expectedResult = some1 / some2;
        int actualResult = calculator.divide(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide5() throws InterruptedException {
        int some1 = 100, some2 = 5;
        int expectedResult = some1 / some2;
        int actualResult = calculator.divide(some1, some2);
        Thread.sleep(5000);
        assertEquals(actualResult, expectedResult);
    }
}
