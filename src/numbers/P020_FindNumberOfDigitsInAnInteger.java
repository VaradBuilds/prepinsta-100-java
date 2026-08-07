package src.numbers;

import java.util.Scanner;

public class P020_FindNumberOfDigitsInAnInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = sc.nextInt();

        System.out.print("Number of digits in the " + num + " are " + countDigits(num));
    }

    private static int countDigits(int num) {

        num = Math.abs(num);

        if (num == 0)
            return 1;

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

//    private static int countDigits(int num) {
//        return String.valueOf(Math.abs(num)).length();
//    }
}
