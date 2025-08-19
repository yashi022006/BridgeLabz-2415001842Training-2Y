package practice_problem;

import java.util.Scanner;

public class kilometer_to_miles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

      
        double miles = kilometers * 0.621371;

        
        System.out.println(kilometers + " kilometers = " + miles + " miles");

        sc.close();


	}

}
