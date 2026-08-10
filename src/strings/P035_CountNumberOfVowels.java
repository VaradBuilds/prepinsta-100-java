package src.strings;

import src.utils.InputUtil;

public class P035_CountNumberOfVowels {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter a string : ");
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.print("Number of vowel in the string - " + count);
    }
}
