package src.strings;

import src.utils.InputUtil;

public class P034_ToggleEachCharacterInAString {

    public static void main(String[] args) {

        String str = InputUtil.readString("Enter a String: ");

        System.out.print("New String : " + toggleString(str));
    }

    private static String toggleString(String str) {

        StringBuilder newStr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                newStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                newStr.append(Character.toUpperCase(ch));
            } else {
                newStr.append(ch);
            }
        }
        return newStr.toString();
    }
}
