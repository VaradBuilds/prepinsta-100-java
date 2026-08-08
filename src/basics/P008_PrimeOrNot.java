package src.basics;

import java.util.Scanner;

public class P008_PrimeOrNot {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println(
                    isPrime(num)
                            ? num + " is a prime number."
                            : num + " is not a prime number."
            );
        }
    }

    public static boolean isPrime(int num) {

        if (num < 2) return false;

        if (num == 2) return true;

        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean isPrime(int n, int i) {
//
//        if (n <= 2)
//            return n == 2;
//        if (n % i == 0)
//            return false;
//        if (i * i > n)
//            return true;
//
//        return isPrime(n, i + 1);
//    }
}