package question_1;

import java.util.*;
import java.lang.*;

public class LongestSubstring {
    // Method to find the longest substring without repetition
    public String longestSubstringWithoutRepetition(String s) {
        int n = s.length();

        // for checking the current substring without repetition
        int start = 0;
        int end = 0;

        // for checking the max length
        int maxLength = 0;

        // to check the position of the current substring without repetition
        int currentStart = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        while (end < n) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= currentStart) {
                currentStart = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            // to compare the lengths of the strings with the maxLength
            if (end - currentStart > maxLength) {
                // Update the start index and maximum length
                start = currentStart;
                maxLength = end - currentStart;
            }

            end++;
        }

        return s.substring(start, start + maxLength + 1);
    }

    public static void main(String[] args) {
        LongestSubstring ob = new LongestSubstring();
        String s = "Welcome to PowerRouter";
        System.out.println(ob.longestSubstringWithoutRepetition(s));
    }
}
