package homeworks.hw1.sevenAdvancedLoremIpsum;

import java.io.*;

public class AdvancedLoremIpsum {
    public static void main(String[] args) {

        String tmpText = "";

        //read text from file
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/homeworks/hw1/sevenAdvancedLoremIpsum/input.txt")))) {
            while (reader.ready()) {
                tmpText += reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //delete all except letters
        tmpText = tmpText.replaceAll("[.,\\d]", "");

        ////delete all words than theirs length > 3
        tmpText = tmpText.replaceAll("\\b[\\w]{0,4}\\b", "");

        ////delete all  "space" that repeat
        tmpText = tmpText.replaceAll("[\\W]{1,10}", " ");

        //write text to file
        try (FileWriter writer = new FileWriter(
                "src/homeworks/hw1/sevenAdvancedLoremIpsum/filtered_lorem_ipsum.txt")) {
            writer.write(tmpText);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
