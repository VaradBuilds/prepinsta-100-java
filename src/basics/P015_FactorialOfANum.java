package src.basics;

import java.util.Scanner;

public class P015_FactorialOfANum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + "! = " + factorial(num));
    }

    private static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            
            return 1;
        }
        return n * factorial(n - 1);
    }
}
