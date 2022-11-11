package test1;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(expectedExceptions = ArithmeticException.class, dataProvider = "FirstTest")
    public void parameterizedTest(String name) {
        System.out.println(name);
        throw new ArithmeticException();
    }

    @org.testng.annotations.DataProvider(name = "FirstTest")

    public static Object[][] primeNumbers() {

        return new Object[][] {{"Hello"}, {"123"}, {"19"}, {"Test"}, {"33"}};

    }
}
