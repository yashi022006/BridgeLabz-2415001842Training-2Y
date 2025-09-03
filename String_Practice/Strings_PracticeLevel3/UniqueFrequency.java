package Strings_PracticeLevel3;

import java.util.*;

public class UniqueFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = uniqueFrequency(text);
        for (String[] row : result) {
            System.out.println(row[0] + " : " + row[1]);
        }
        sc.close();
    }

    static char[] uniqueChars(String s) {
        int n = s.length();
        char[] temp = new char[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < size; j++) if (temp[j] == c) found = true;
            if (!found) temp[size++] = c;
        }
        return Arrays.copyOf(temp, size);
    }

    static String[][] uniqueFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }
}

