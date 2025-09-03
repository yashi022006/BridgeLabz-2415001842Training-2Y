package Control_flow_level1;

import java.util.Scanner;

public class Divisible_by_5 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in) ;
		System.out.print("Enter a number:");
		int number=sca.nextInt();
		
		if(number%5==0) {
			System.out.printf("%d Divisible by 5",number);
			
		}else {
			System.out.printf("%d Not Divisible by 5",number);
		}
		
       sca.close();
	}

}
