package Strings_PracticeLevel1;
import java.util.*;
public class numberFormat {
	

	
	    static void generateException(String s) {
	        int num = Integer.parseInt(s); // if not numeric -> exception
	        System.out.println(num);
	    }

	    static void handleException(String s) {
	        try {
	            int num = Integer.parseInt(s);
	            System.out.println(num);
	        } catch (NumberFormatException e) {
	            System.out.println("Handled NumberFormatException");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.next();
	       
	        handleException(text);
	        sc.close();
	    }
	}


