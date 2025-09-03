package Control_flow_level1;

import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in) ;
		int year=sca.nextInt();
		 boolean isLeap = false;

	        if (year % 400 == 0) {
	            isLeap = true;              
	        } else if (year % 100 == 0) {
	            isLeap = false;              
	        } else if (year % 4 == 0) {
	            isLeap = true;           
	        }

	        if (isLeap) {
	            System.out.println("Leap Year");
	        } else {
	            System.out.println("Not Leap Year");
	        }
	        sca.close();
}
	}
