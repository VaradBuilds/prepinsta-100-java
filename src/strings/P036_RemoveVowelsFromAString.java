package src.strings;

import src.utils.InputUtil;

public class P036_RemoveVowelsFromAString {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter a string : ");
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                continue;
            }
            newStr.append(ch);
        }

//        String s1 = str.replaceAll("[aeiouAEIOU]", "" );

        System.out.print("String without Vowels - " + newStr);
    }
}
