package src.basics;

import java.util.Scanner;

public class P004_SumOFNumsInGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range from - ");
        int from = sc.nextInt();
        System.out.print("Enter the Range to - ");
        int to = sc.nextInt();

        System.out.println(sumOfGivenRange(from, to));
    }

    private static int sumOfGivenRange(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }
}

//    private static long sumOfGivenRange(int start, int end) {
//
//        if (start > end) {
//            int temp = start;
//            start = end;
//            end = temp;
//        }
//
//        long n = (long) end - start + 1;
//        return n * (start + end) / 2;
//    }