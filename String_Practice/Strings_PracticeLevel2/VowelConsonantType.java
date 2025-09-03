package Strings_PracticeLevel2;

import java.util.Scanner;

public class VowelConsonantType {
	    static String checkChar(char c){
	        if(c>='A'&&c<='Z') c=(char)(c+32);
	        if(c>='a'&&c<='z'){
	            if("aeiou".indexOf(c)!=-1) return "Vowel";
	            else return "Consonant";
	        }
	        return "Not a Letter";
	    }
	    static String[][] getTypes(String s){
	        String[][] arr=new String[s.length()][2];
	        for(int i=0;i<s.length();i++){
	            arr[i][0]=String.valueOf(s.charAt(i));
	            arr[i][1]=checkChar(s.charAt(i));
	        }
	        return arr;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String text=sc.nextLine();
	        String[][] arr=getTypes(text);
	        for(int i=0;i<arr.length;i++)
	            System.out.println(arr[i][0]+"\t"+arr[i][1]);
	        sc.close();
	    }
	}


