package Strings_PracticeLevel2;


import java.util.*;

	public class WordsWithLength {
	    static int myLength(String s){
	        int c=0; try{ while(true){ s.charAt(c); c++; } }
	        catch(Exception e){ return c; }
	    }
	    static String[] mySplit(String s){
	        int len=myLength(s), count=1;
	        for(int i=0;i<len;i++) if(s.charAt(i)==' ') count++;
	        String[] arr=new String[count];
	        int start=0,index=0;
	        for(int i=0;i<len;i++){
	            if(s.charAt(i)==' '){
	                arr[index++]=s.substring(start,i);
	                start=i+1;
	            }
	        }
	        arr[index]=s.substring(start,len);
	        return arr;
	    }
	    static String[][] wordWithLength(String[] words){
	        String[][] arr=new String[words.length][2];
	        for(int i=0;i<words.length;i++){
	            arr[i][0]=words[i];
	            arr[i][1]=String.valueOf(myLength(words[i]));
	        }
	        return arr;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String text=sc.nextLine();
	        String[] words=mySplit(text);
	        String[][] table=wordWithLength(words);
	        for(int i=0;i<table.length;i++)
	            System.out.println(table[i][0]+"\t"+Integer.parseInt(table[i][1]));
	        sc.close();
	    }
	}


