package Strings_PracticeLevel3;

import java.util.*;

public class PalindromeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(isPalindrome(text) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }

    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}

