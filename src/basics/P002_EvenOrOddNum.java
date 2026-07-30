package src.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P002_EvenOrOddNum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Valid Number: ");
            int num = sc.nextInt();

            if (num % 2 == 0)
                System.out.println(num + " is an even number");
            else
                System.out.println(num + " is an odd number");
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}