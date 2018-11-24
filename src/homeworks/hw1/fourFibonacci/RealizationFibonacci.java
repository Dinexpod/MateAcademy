package homeworks.hw1.fourFibonacci;

public class RealizationFibonacci {
    /*
     * The method that make realization "Fibonacci number"
     */
    public static double realization(int fibonacciSize) {
        if (fibonacciSize <= 1) {
            return fibonacciSize;
        } else {
            return (realization(fibonacciSize - 1) + realization(fibonacciSize-2));
        }
    }
}
