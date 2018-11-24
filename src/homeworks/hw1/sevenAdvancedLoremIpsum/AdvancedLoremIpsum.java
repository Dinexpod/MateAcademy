package homeworks.hw1.sevenAdvancedLoremIpsum;

import java.io.*;

public class AdvancedLoremIpsum {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream("src/homeworks/hw1/sevenAdvancedLoremIpsum/input.txt")))) {
            String textFromInput = "";
            while (reader.ready()) {
                textFromInput += reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
