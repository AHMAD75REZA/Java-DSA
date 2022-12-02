// Question.
// Given a string, determine if it is a palindrome, considering only alphanumeric characters.

// Solution
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPalindrome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) {
            str = str.trim();
        } else {
            str = "";
        }
        boolean ans = Solution.isPalindrome(str);
        System.out.println(ans);
    }
}

class Solution {
    public static boolean isPalindrome(String str) {
        // Your code goes here
        int j = str.length() - 1;
        int i = 0;
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        while (i == j) {
            i++;
            j--;
        }
        return true;
    }
}