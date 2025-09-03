package Strings_PracticeLevel1;

public class nullPointerException {

	    static void generateException() {
	        String text = null;
	        System.out.println(text.length());
	    }

	    static void handleException() {
	        try {
	            String text = null;
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Handled NullPointerException");
	        }
	    }

	    public static void main(String[] args) {
	        
	        handleException();
	    }
	}


