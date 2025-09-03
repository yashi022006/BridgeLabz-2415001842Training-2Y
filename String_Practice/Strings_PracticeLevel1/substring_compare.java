package Strings_PracticeLevel1;

import java.util.*;

public class substring_compare {
    static String mySubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = mySubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Manual substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Compare result: " + compareByCharAt(sub1, sub2));
        sc.close();
    }
}

