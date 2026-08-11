package src.strings;

import src.utils.InputUtil;

public class P039_RemoveCharactersFromStringExceptAlphabet {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter A String : ");
        StringBuilder newStr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                newStr.append(ch);
        }
        System.out.print("String with only Alphabets: " + newStr);
    }
}