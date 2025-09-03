package Strings_PracticeLevel1;

import java.util.*;


public class toCharArray{
    static char[] myToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr1 = myToCharArray(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Arrays equal: " + compareArrays(arr1, arr2));
        sc.close();
    }
}
