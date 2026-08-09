package src.recursion;

import src.utils.InputUtil;

public class P026_LengthOfTheString {

    public static void main(String[] args) {

        String str = InputUtil.readString("Enter the string: ");
        System.out.println("length of the string " + recLength(str));
    }

    private static int recLength(String str) {

        if (str.isEmpty())
            return 0;
        else
            return recLength(str.substring(1)) + 1;
    }
}
