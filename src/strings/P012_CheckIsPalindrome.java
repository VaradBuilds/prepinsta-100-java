package src.strings;

import java.util.Scanner;

public class P012_CheckIsPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");

        String str = sc.nextLine();
        System.out.println(isPalindrome(str.toLowerCase()) ? str + " is a palindrome" : str + " is not a palindrome");
    }

    private static boolean isPalindrome(String str) {

        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }


//    private static boolean isPalindrome(String str) {
//
//        String reversed = "";
//        int len = str.length();
//
//        for (int i = len - 1; i >= 0; i--) {
//
//            reversed = reversed + str.charAt(i);
//        }
//        return str.equals(reversed);
//    }


//    private static boolean isPalindrome(String str) {
//
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//
//            left++;
//            right--;
//        }
//
//        return true;
//    }
}
