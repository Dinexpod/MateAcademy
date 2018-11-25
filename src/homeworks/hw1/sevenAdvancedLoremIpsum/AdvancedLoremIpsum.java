package homeworks.hw1.sevenAdvancedLoremIpsum;

import java.io.*;

public class AdvancedLoremIpsum {
    public static void main(String[] args) {

        String textFromInput = "";

        //read text from file
        try(BufferedReader reader = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream("src/homeworks/hw1/sevenAdvancedLoremIpsum/input.txt")))) {
            while (reader.ready()) {
                textFromInput += reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //delete all except letters
        textFromInput = textFromInput.replaceAll("[.,\\d]", "");

        ////delete all words than theirs length > 3
        textFromInput = textFromInput.replaceAll("\\b[\\w]{0,4}\\b", "");

        ////delete all  "space" that repeat
        textFromInput = textFromInput.replaceAll("[\\W]{1,10}", " ");

        //write text to file
        try(FileWriter writer = new FileWriter(
                "src/homeworks/hw1/sevenAdvancedLoremIpsum/filtered_lorem_ipsum.txt")) {
             writer.write(textFromInput);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
