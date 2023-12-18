package question_6;

public class ReverseString {
    public static void main(String args[]) {
        String str1 = "Welcome";
        System.out.println("Original string: " + str1);

        int n = str1.length();

        // empty string to store the reversed string
        String reverseString = "";
        char ch;
        for (int i = 0; i < n; i++) {
            ch = str1.charAt(i);

            // adding each character in front of the new string to reverse it
            reverseString = ch + reverseString;
        }

        System.out.println("Reversed string: " + reverseString);
    }
}
