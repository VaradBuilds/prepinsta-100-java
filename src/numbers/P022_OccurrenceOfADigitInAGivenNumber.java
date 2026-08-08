package src.numbers;

import java.util.Scanner;

public class P022_OccurrenceOfADigitInAGivenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Enter digit : ");
        int x = sc.nextInt();
        
        if (x < 0 || x > 9) {
            System.out.print("Please enter a single digit (0-9).");
            return;
        }
        int count = countOccurrences(num, x);

        System.out.printf(
                "In the number %d, %d occurs %d time(s).",
                num,
                x,
                count
        );
    }

    private static int countOccurrences(int num, int digit) {

        if (num == 0) {
            return digit == 0 ? 1 : 0;
        }
        num = Math.abs(num);
        int count = 0;

        while (num != 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
