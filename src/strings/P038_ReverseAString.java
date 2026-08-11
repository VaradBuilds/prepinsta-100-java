package src.strings;

import src.utils.InputUtil;

public class P038_ReverseAString {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter a string : ");
        StringBuilder sb = new StringBuilder(str);
//      String newStr = sb.reverse().toString();
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.print("Reversed String - " + newStr);
    }
}
