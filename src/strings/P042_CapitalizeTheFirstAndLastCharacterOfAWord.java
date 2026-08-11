package src.strings;

import src.utils.InputUtil;

public class P042_CapitalizeTheFirstAndLastCharacterOfAWord {

    public static void main(String[] args) {

        String str = InputUtil.readString("Enter A String : ");

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            char first = Character.toUpperCase(word.charAt(0));
            char last = Character.toUpperCase(word.charAt(word.length() - 1));

            if (word.length() == 1) {
                words[i] = String.valueOf(first);
            } else {
                words[i] = first
                        + word.substring(1, word.length() - 1)
                        + last;
            }
        }
        System.out.print(String.join(" ", words));
    }
}