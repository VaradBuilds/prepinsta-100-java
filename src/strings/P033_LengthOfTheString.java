package src.strings;

import src.utils.InputUtil;

public class P033_LengthOfTheString {

    public static void main(String[] args) {

        String str = InputUtil.readString("Enter The String : ");
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        System.out.print("length of string = " + length);
    }
}