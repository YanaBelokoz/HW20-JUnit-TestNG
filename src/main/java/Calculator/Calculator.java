package Calculator;

public class Calculator {
    private int result;

    public int add(int some1, int some2) {return some1 + some2;}

    public int substract(int some1, int some2) {return some1 - some2;}

    public int multiply(int some1, int some2) {return some1 * some2;}

    public int divide(int some1, int some2) {return some1 / some2;}

    public int add(int some2) {
        result+=some2;
        return result;
    }

    public int multiply(int some2) {
        result*=some2;
        return result;
    }

    public int divide(int some2) {
        result/=some2;
        return result;
    }

    public int getResult() { return result; }

    public boolean isResultNegative() { return result < 0;}
}
