package Control_flow_level1;

import java.util.Scanner;

public class Spring_season {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		boolean isSpring=false;
		int day=sc.nextInt();
		 if ((month == 3 && day >= 20 && day <= 31) ||   
		            (month == 4 && day >= 1 && day <= 30) ||  
		            (month == 5 && day >= 1 && day <= 31) ||    
		            (month == 6 && day >= 1 && day <= 20)) {    
		            isSpring = true;
		        }
		 if(isSpring==true) {
			 System.out.print("Its a Spring Season");
		}else {
			System.out.print("Not a Spring Season");
		}
		 sc.close();
	}

}
