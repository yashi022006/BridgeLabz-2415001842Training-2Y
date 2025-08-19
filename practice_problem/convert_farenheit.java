package practice_problem;

import java.util.Scanner;

public class convert_farenheit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter temp in celcious: ");
		int celcious=sc.nextInt();
		int fahrenheit=(celcious*9/5)+32;
		System.out.println(fahrenheit);
		sc.close();
	}

}
