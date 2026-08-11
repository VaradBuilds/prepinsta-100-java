package src.strings;

public class P045_ReplaceAWordFromGivenString {

    public static void main(String[] args) {

        String str = "We want A healthy and greener planet";
        String replace = "planet";
        String word = "clean";

//        str = str.replaceAll("healthy", "Clean");

        System.out.print("Replaced String :" + replaceWord(str, replace, word));
    }

    private static String replaceWord(String s, String replace, String word) {

        String[] wordsArr = s.split(" ");

        for (int i = 0; i < wordsArr.length; i++) {

            if (wordsArr[i].equals(replace)) {
                wordsArr[i] = word;
            }
        }
        return String.join(" ", wordsArr);
    }
}
