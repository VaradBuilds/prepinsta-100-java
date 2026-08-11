package src.strings;

import java.util.Arrays;

public class P043_TwoStringsAnagramOrNot {
    public static void main(String[] args) {

        String str1 = "We are here";
        String str2 = "Here we are";

        System.out.println(isAnagram(str1, str2) ? "Two String are an Anagram" : "Two String are not an Anagram");
    }

    private static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}