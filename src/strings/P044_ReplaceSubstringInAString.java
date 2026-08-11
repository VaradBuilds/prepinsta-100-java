package src.strings;

public class P044_ReplaceSubstringInAString {
    public static void main(String[] args) {

        String str = "This is A String.";
        String toReplace = "is";
        String replacement = "was";

        System.out.print("Replaced String: " + replaceSubString(str, toReplace, replacement));
    }

    private static String replaceSubString(String s, String replace, String with) {
        return s.replace(replace, with);
    }
}