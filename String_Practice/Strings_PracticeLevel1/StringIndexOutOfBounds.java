package Strings_PracticeLevel1;

import java.util.*;

public class StringIndexOutOfBounds {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // invalid index
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        handleException(text);
        sc.close();
    }
}

