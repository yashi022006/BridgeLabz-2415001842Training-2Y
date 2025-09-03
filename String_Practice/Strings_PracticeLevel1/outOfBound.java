package Strings_PracticeLevel1;
import java.util.*;

public class outOfBound {
	
	
	    static void generateException(String[] arr) {
	        System.out.println(arr[arr.length]); // invalid
	    }

	    static void handleException(String[] arr) {
	        try {
	            System.out.println(arr[arr.length]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Handled ArrayIndexOutOfBoundsException");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String[] names = new String[n];
	        for (int i = 0; i < n; i++) names[i] = sc.next();

	        
	        handleException(names);
	        sc.close();
	    }
	}


