package homeworks.hw1.fourFibonacci;

public class RealizationFibonacci {
    /*
     * The method that make realization "Fibonacci number"
     */
    public static int realizationFibonacciNumber(int fibonacciSize) {
        if (fibonacciSize <= 1) {
            return fibonacciSize;
        } else {
            return (realizationFibonacciNumber(fibonacciSize - 1)
                    + realizationFibonacciNumber(fibonacciSize-2));
        }
    }
}
