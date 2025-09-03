package Strings_PracticeLevel3;

import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char ans = firstUnique(text);
        System.out.println(ans);
        sc.close();
    }

    static char firstUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return '_';
    }
}

