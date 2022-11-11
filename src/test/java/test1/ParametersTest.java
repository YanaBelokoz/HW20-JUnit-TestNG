package test1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
    @Test(expectedExceptions = ArithmeticException.class)
    public void parameterizedTest() {
        throw new ArithmeticException();
    }

    @Test
    @Parameters("MyName")
    public void parameterizedTest(String name) {
        System.out.println(name);
        throw new ArithmeticException();
    }
}
