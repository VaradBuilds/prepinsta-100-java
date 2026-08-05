package src.numbers;

import java.util.Scanner;

public class P016_HCFOfTwoNums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int a = sc.nextInt();
        System.out.print("Enter second number - ");
        int b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.print("HCF is undefined when one of the numbers is 0.");
            return;
        }
        System.out.print("Highest Common factor of " + a + " and " + b + " is - " + findHcf(a, b));
    }

    public static int findHcf(int a, int b) {
//      Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

//    private static int findHcf(int a, int b) {
////      Recursive Approach
//        if (b == 0) {
//            return a;
//        }
//        return findHcf(b, a % b);
//    }
}
