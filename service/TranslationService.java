package service;

import static input.InputService.intInput;
import static input.InputService.charInput;


public class TranslationService {

    //  Menu
    public static int entryAndMenu() {

        System.out.println("1. Azerbaijani to English" +
                "\n2. English to Azerbaijani" +
                "\n3. Exit");

        System.out.println();

        return intInput("Choose an option: ");
    }

    //     Menu choices
    public static void menuChoices(int choice) {

        while (true) {
            switch (choice) {
                case 1:
                    ToEnglish english = new ToEnglish();
                    english.translationToEnglish();
                    System.out.println("Thank you for participating!");

                    System.out.println("==================");
                    System.out.println("Wanna play again?");
                    System.out.println();
                    entryAndMenu();
                    break;
                case 2:
                    ToAzerbaijani azerbaijani = new ToAzerbaijani();
                    azerbaijani.translateToAzerbaijani();
                    System.out.println("Thank you for participating!");

                    System.out.println("==================");
                    System.out.println("Wanna play again?");
                    System.out.println();
                    entryAndMenu();
                    break;
                case 3:
                    System.out.println("System has been closed.");
                    System.exit(-1);
                default:
                    System.err.println("Invalid option");
            }
        }
    }

}
