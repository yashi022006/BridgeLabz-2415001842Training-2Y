package Strings_PracticeLevel2;
import java.util.*;
public class StudentGrades {
	

	
	    static int[][] generateScores(int n){
	        Random r=new Random();
	        int[][] arr=new int[n][3];
	        for(int i=0;i<n;i++) for(int j=0;j<3;j++) arr[i][j]=40+r.nextInt(61);
	        return arr;
	    }
	    static double[][] calc(int[][] scores){
	        double[][] arr=new double[scores.length][3];
	        for(int i=0;i<scores.length;i++){
	            int total=scores[i][0]+scores[i][1]+scores[i][2];
	            double avg=total/3.0;
	            double perc=Math.round((total/300.0*100)*100.0)/100.0;
	            arr[i][0]=total; arr[i][1]=avg; arr[i][2]=perc;
	        }
	        return arr;
	    }
	    static String grade(double perc){
	        if(perc>=90) return "A";
	        else if(perc>=80) return "B";
	        else if(perc>=70) return "C";
	        else if(perc>=60) return "D";
	        else return "F";
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int[][] scores=generateScores(5);
	        double[][] calc=calc(scores);
	        for(int i=0;i<scores.length;i++){
	            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(int)calc[i][0]+"\t"+String.format("%.2f",calc[i][1])+"\t"+calc[i][2]+"%\t"+grade(calc[i][2]));
	        }
	        sc.close();
	    }
	}


