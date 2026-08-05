package src.numbers;

import java.util.Scanner;

public class P017_LCMOfTwoNums {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            if (a == 0 || b == 0) {
                System.out.println("LCM is undefined when one of the numbers is 0.");
                return;
            }
            System.out.print("LCM = " + findLcm(a, b));
        }
    }

    private static int findLcm(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        return (a * b) / P016_HCFOfTwoNums.findHcf(a, b);
    }
}