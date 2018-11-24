package homeworks.hw1.fourFibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input fibonacci size:");
        int fibonacciSize = Integer.parseInt(reader.readLine());


        System.out.println(RealizationFibonacci.realization(fibonacciSize));
    }
}
