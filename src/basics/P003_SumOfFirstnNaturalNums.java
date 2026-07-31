package src.basics;

import java.util.Scanner;

public class P003_SumOfFirstnNaturalNums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which sum is required");

        int n = sc.nextInt();

        System.out.println(sumOfFirstNaturalNums(n));
    }

    static int sumOfFirstNaturalNums(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum += x;
        }
        return sum;
    }
}
