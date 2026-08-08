package src.numbers;

import src.basics.P007_LeapYearOrNot;

import java.util.Scanner;

public class P021_NumberOfDaysInAGivenMonthOfAYear {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter month: ");
            String month = sc.next();

            System.out.print("Enter year: ");
            int year = sc.nextInt();
            if (year <= 0) {
                System.out.println("Invalid year.");
                return;
            }

            int days = calculateDaysInTheMonth(month, year);

            if (days == 0) {
                System.out.println("Invalid month.");
            } else {
                System.out.printf("%s %d has %d days.%n", month, year, days);
            }
        }
    }

    private static int calculateDaysInTheMonth(String month, int year) {

        return switch (month.toLowerCase()) {
            case "january", "march", "may", "july", "august", "october", "december" -> 31;
            case "april", "june", "september", "november" -> 30;
            case "february" -> P007_LeapYearOrNot.isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    }
}
