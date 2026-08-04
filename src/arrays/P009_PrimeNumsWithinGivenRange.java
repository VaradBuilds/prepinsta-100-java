package src.arrays;

import src.basics.P008_PrimeOrNot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P009_PrimeNumsWithinGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range from - ");
        int from = sc.nextInt();
        System.out.print("Enter the Range to - ");
        int to = sc.nextInt();

        List<Integer> primes = findPrimes(from, to);
        System.out.print(primes);
    }

    private static List<Integer> findPrimes(int x, int y) {

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = x; i <= y; i++) {
            if (P008_PrimeOrNot.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}