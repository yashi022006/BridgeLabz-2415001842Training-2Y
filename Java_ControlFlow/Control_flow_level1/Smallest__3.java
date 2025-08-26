package Control_flow_level1;

import java.util.Scanner;

public class Smallest__3 {

	public static void main(String[] args) {
	   Scanner sca= new Scanner(System.in);
	   int a=sca.nextInt();
	   int b=sca.nextInt();
	   int c=sca.nextInt();
	   boolean isSmall=true;
	   if(a>b&&a>c) {
	    isSmall=false;
	   }
	   System.out.println(isSmall);
	   sca.close();
	}

}
