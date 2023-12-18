package question_4;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "ceelmow";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // to check if length of strings are equal
        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Checking if sorted character arrays are equal
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not an anagram.");
            }
        } else {
            // Print if the lengths of the strings are not equal
            System.out.println(str1 + " and " + str2 + " are not an anagram.");
        }
    }
}
