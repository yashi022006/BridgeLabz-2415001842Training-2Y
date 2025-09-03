package Strings_PracticeLevel3;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] row : result) {
            System.out.println(row[0] + " : " + row[1]);
        }
        sc.close();
    }

    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                list.add(new String[]{String.valueOf((char) i), String.valueOf(freq[i])});
            }
        }
        return list.toArray(new String[0][0]);
    }
}

