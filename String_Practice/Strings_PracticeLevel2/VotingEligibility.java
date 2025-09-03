package Strings_PracticeLevel2;
import java.util.*;
public class VotingEligibility {
	

	    static int[] generateAges(int n){
	        Random r=new Random();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
	        return arr;
	    }
	    static String[][] canVote(int[] ages){
	        String[][] arr=new String[ages.length][2];
	        for(int i=0;i<ages.length;i++){
	            arr[i][0]=String.valueOf(ages[i]);
	            if(ages[i]>=18) arr[i][1]="true";
	            else arr[i][1]="false";
	        }
	        return arr;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int[] ages=generateAges(10);
	        String[][] res=canVote(ages);
	        for(int i=0;i<res.length;i++)
	            System.out.println(res[i][0]+"\t"+res[i][1]);
	        sc.close();
	    }
	}


