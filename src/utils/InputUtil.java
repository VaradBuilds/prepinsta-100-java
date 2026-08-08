package src.utils;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner SC = new Scanner(System.in);

    public static int readInt(String message) {

        while (true) {

            System.out.print(message);
            if (SC.hasNextInt()) {
                return SC.nextInt();
            }
            System.out.println("Invalid input! Please enter an integer.");
            SC.next();
        }
    }

    public static String readString(String message) {
        System.out.print(message);
        return SC.next();
    }
}