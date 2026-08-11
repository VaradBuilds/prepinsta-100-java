package src.strings;

import src.utils.InputUtil;

public class P040_RemoveSpacesFromAString {
    public static void main(String[] args) {

        String str = InputUtil.readString("Enter A String : ");
        str = str.replaceAll("\\s+", "");
        System.out.print("String Without Spaces: " + str);
    }
}