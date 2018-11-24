package homeworks.hw1.fourFibonacci;

public class RealizationFibonacci {
    /*
     * The method that make realization "Fibonacci number"
     */
    public static int countFibonacciNumber(int fibonacciSize) {
        if (fibonacciSize <= 1) {
            return fibonacciSize;
        } else {
            return (countFibonacciNumber(fibonacciSize - 1)
                    + countFibonacciNumber(fibonacciSize-2));
        }
    }
}
