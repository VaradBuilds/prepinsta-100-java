package src.basics;

import java.util.Scanner;

public class P011_ReverseOfANum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        int num = sc.nextInt();
        int reversed = 0;

        System.out.print("Reversed Number: " + reverseNumber(num, reversed));
    }

    private static int reverseNumber(int num, int rev) {

        while (num != 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

//    private static int reverseNumber(int num, int rev) {
//
//        if (num == 0)
//            return rev;
//        rev = rev * 10 + (num % 10);
//        return reverseNumber(num / 10, rev);
//    }
}
