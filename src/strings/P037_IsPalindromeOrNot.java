package src.strings;

import src.utils.InputUtil;

public class P037_IsPalindromeOrNot {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter a string : ");
        str = str.toLowerCase().replaceAll("\\s+", "");

        StringBuilder newStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);
            newStr.append(ch);
        }
        System.out.print("Is Palindrome - " + str.equals(newStr.toString()));
    }
}