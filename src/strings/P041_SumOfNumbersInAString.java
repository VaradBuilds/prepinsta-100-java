package src.strings;

import src.utils.InputUtil;

public class P041_SumOfNumbersInAString {

    public static void main(String[] args) {

        String str = InputUtil.readString("Enter A String : ");
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }
        System.out.print("Sum of numbers in a String: " + sum);
    }
}
