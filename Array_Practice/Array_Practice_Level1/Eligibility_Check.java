package Array_Practice_Level1;

import java.util.Scanner;

public class Eligibility_Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>18) {
				System.out.printf("The student with age %d can vote\n",arr[i]);
			}else if(arr[i]<0) {
				System.out.printf("The student age is invalid\n");
			}else {
				System.out.printf("The student with age %d cannot vote\n",arr[i]);
			}
		}
		
		sc.close();
	}

}
