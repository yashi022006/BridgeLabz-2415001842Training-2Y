package Strings_PracticeLevel1;

import java.util.Scanner;

public class illegalArgument {
	

	
	    static void generateException(String s) {
	        System.out.println(s.substring(5, 2)); // invalid indices
	    }

	    static void handleException(String s) {
	        try {
	            System.out.println(s.substring(5, 2));
	        } catch (IllegalArgumentException e) {
	            System.out.println("Handled IllegalArgumentException");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.next();
	        
	        handleException(text);
	        sc.close();
	    }
	}


