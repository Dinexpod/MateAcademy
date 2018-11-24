package homeworks.hw1.sevenAdvancedLoremIpsum;

import java.io.*;

public class AdvancedLoremIpsum {
    public static void main(String[] args) {

        String textFromInput = "";

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

        //textFromInput = textFromInput.replaceAll("stop" ,"");
        textFromInput = textFromInput.replaceAll("\\b\\w{3,3}\\b", "");
        System.out.println(textFromInput);

//        try(FileWriter writer = new FileWriter(
//                "src/homeworks/hw1/sevenAdvancedLoremIpsum/filtered_lorem_ipsum.txt")) {
//             writer.write(textFromInput);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
