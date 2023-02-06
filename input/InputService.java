package input;

import java.util.Scanner;

public class InputService {

    public static String stringInput() {

        Scanner stringSc = new Scanner(System.in);

        return stringSc.nextLine();
    }

    public static char charInput(String statement) {

        Scanner charSc = new Scanner(System.in);
        System.out.println(statement);
        return charSc.next().charAt(0);
    }
    public static int intInput(String statement) {

        Scanner intSc = new Scanner(System.in);

        System.out.print(statement);
        return intSc.nextInt();
    }
}
