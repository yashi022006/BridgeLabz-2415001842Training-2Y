package Strings_PracticeLevel2;

import java.util.*;

public class Len {
    static int myLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int manualLength = myLength(text);
        int builtinLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
        sc.close();
    }
}
