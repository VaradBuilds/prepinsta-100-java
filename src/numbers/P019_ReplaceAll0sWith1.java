package src.numbers;

import java.util.Scanner;

public class P019_ReplaceAll0sWith1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer value having 0 in it : ");
        int num = sc.nextInt();
        System.out.print("Replaced number : " + replaceZeros(num));
    }


    //  Using String approach
    private static int replaceZeros(int num) {

        String result = String.valueOf(num).replace('0', '1');
        return Integer.parseInt(result);
    }


//    using Mathematical approach
//    private static int replaceZeros(int num) {
//
//        if (num == 0) {
//            return 1;
//        }
//
//        int newNum = 0;
//        while (num > 0) {
//
//            int digit = num % 10;
//            if (digit == 0) {
//                digit = 1;
//            }
//            newNum = newNum * 10 + digit;
//            num /= 10;
//        }
//        return reverse(newNum);
//    }
//
//    private static int reverse(int num) {
//
//        int rev = 0;
//        while (num > 0) {
//            rev = rev * 10 + num % 10;
//            num /= 10;
//        }
//        return rev;
//    }
}
