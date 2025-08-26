package Control_flow_level1;

import java.util.Scanner;

public class Sum_n_natural_no_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		double Sum_n=(number*(number+1))/2;
		if(number>=0) {
			System.out.printf("The sum of %d natural numbers is %.2f",number,Sum_n);
		}else {
			System.out.printf("The number %d is not a natural number",number);
		}
		
  sc.close();
	}

}
