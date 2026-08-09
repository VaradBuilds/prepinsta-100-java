package src.strings;

public class P032_AlphabetOrNot {

    public static void main(String[] args) {

        char ch = '-';
        int val = ch; // ASCII value of the character

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {

            System.out.printf("Character '%c' is an Alphabet: ASCII Value is '%d'", ch, val);
        } else
            System.out.print("Not an Alphabet: ASCII value is " + val);
    }
}
