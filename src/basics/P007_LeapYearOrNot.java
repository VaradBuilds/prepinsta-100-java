package src.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P007_LeapYearOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a valid year to find out if its a leap year or not: ");
            int year = sc.nextInt();

            if (year < 1 || year > 9999) {
                System.out.println("Not a valid year!");
                return;
            }

            System.out.println(
                    isLeapYear(year)
                            ? year + " is a leap year."
                            : year + " is not a leap year."
            );

        } catch (InputMismatchException e) {
            System.out.println("Not a valid year!");
        }
    }

    private static boolean isLeapYear(int year) {
        // if it is divisible by 4 but not divisible to 100 and if it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }
}