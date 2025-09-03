package Strings_PracticeLevel3;

import java.util.*;

public class PalindromeTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindrome(text) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
