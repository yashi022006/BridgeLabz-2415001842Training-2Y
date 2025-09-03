package Strings_PracticeLevel3;
import java.util.*;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }

    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static char[] findUnique(String s) {
        int n = getLength(s);
        char[] temp = new char[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[size++] = c;
        }
        return Arrays.copyOf(temp, size);
    }
}

