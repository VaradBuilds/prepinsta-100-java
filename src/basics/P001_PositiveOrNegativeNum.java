package src.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P001_PositiveOrNegativeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter any number");
            int num = sc.nextInt();

            if (num > 0)
                System.out.println(num + " is a positive Number");
            else if (num < 0)
                System.out.println(num + " is a negative Number");
            else
                System.out.println(num + " is a Zero");
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
