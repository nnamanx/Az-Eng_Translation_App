package service;

import static input.InputService.stringInput;

import java.io.*;

public class ToAzerbaijani {

    public void translateToAzerbaijani() {

        int correct = 0;
        int wrong = 0;

        System.out.println("----- TRANSLATION TO AZERBAIJANI -----");

        File dictionary = new File("/Users/lamankhudadatzada/Desktop/Java lessons/Lesson_18_Translation/src/dictionary");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(dictionary));

            String line;
            while ((line = reader.readLine()) != null) {

                String[] splitted = line.split(" - ");

                System.out.print(splitted[1] + " - ");

                String input = stringInput();
                if (input.equalsIgnoreCase(splitted[0])) {
                    correct++;
                } else {
                    wrong++;
                    System.out.println("Correct answer: " + splitted[1] + " - " + splitted[0]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Correct answers: " + correct);
        System.out.println("Wrong answers: " + wrong);
    }
}
