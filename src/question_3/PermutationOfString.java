package question_3;

import java.util.*;

public class PermutationOfString {

    // for swapping
    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        String str = "CAT";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");

        // ArrayList to store permutations
        ArrayList<String> permutations = new ArrayList<>();
        generatePermutation(str, 0, len, permutations);
        System.out.println(permutations);
    }

    // for generating permutations
    public static void generatePermutation(String str, int start, int end, ArrayList<String> permutations) {
        if (start == end - 1) {
            permutations.add(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutation(str, start + 1, end, permutations);
                str = swapString(str, start, i);
            }
        }
    }
}
