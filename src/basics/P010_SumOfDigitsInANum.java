package src.basics;

import java.util.Scanner;

public class P010_SumOfDigitsInANum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
