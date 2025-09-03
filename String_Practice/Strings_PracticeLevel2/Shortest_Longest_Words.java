package Strings_PracticeLevel2;
import java.util.*;

public class Shortest_Longest_Words {
	
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
	    static int[] shortestLongest(String[][] arr){
	        int min=0,max=0;
	        for(int i=1;i<arr.length;i++){
	            if(Integer.parseInt(arr[i][1])<Integer.parseInt(arr[min][1])) min=i;
	            if(Integer.parseInt(arr[i][1])>Integer.parseInt(arr[max][1])) max=i;
	        }
	        return new int[]{min,max};
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String text=sc.nextLine();
	        String[] words=mySplit(text);
	        String[][] table=wordWithLength(words);
	        int[] res=shortestLongest(table);
	        System.out.println("Shortest: "+table[res[0]][0]);
	        System.out.println("Longest: "+table[res[1]][0]);
	        sc.close();
	    }
	}

