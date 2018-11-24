package homeworks.hw1.threeRomb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Romb {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input romb size diagonal(odd number):");
        int sizeDiagonal = Integer.parseInt(reader.readLine());

        RombRealization.rombRealization(sizeDiagonal);

        reader.close();
    }
}
