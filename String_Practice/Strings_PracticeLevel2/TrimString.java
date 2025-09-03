package Strings_PracticeLevel2;
import java.util.*;
public class TrimString {
	


	    static int[] trimIndex(String s){
	        int start=0,end=s.length()-1;
	        while(start<=end && s.charAt(start)==' ') start++;
	        while(end>=start && s.charAt(end)==' ') end--;
	        return new int[]{start,end};
	    }
	    static String mySubstring(String s,int start,int end){
	        String res="";
	        for(int i=start;i<=end;i++) res+=s.charAt(i);
	        return res;
	    }
	    static boolean compare(String a,String b){
	        if(a.length()!=b.length()) return false;
	        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
	        return true;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String text=sc.nextLine();
	        int[] idx=trimIndex(text);
	        String trimmed=mySubstring(text,idx[0],idx[1]);
	        String builtin=text.trim();
	        System.out.println("Custom: "+trimmed);
	        System.out.println("Builtin: "+builtin);
	        System.out.println("Equal? "+compare(trimmed,builtin));
	        sc.close();
	    }
	}


