package Strings_PracticeLevel3;

import java.util.*;

public class NestedLoopFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] result = frequency(text);
        for (String r : result) System.out.println(r);
        sc.close();
    }

    static String[] frequency(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) freq[i] = 1;
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') list.add(chars[i] + " : " + freq[i]);
        }
        return list.toArray(new String[0]);
    }
}

