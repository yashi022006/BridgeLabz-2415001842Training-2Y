package Strings_PracticeLevel2;

import java.util.*;


public class Split {
    static int myLength(String s) {
        int c=0;
        try { while(true){ s.charAt(c); c++; } }
        catch(Exception e){ return c; }
    }
    static String[] mySplit(String s) {
        int len=myLength(s), count=1;
        for(int i=0;i<len;i++) if(s.charAt(i)==' ') count++;
        String[] arr=new String[count];
        int start=0, index=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                arr[index++]=s.substring(start,i);
                start=i+1;
            }
        }
        arr[index]=s.substring(start,len);
        return arr;
    }
    static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] myArr=mySplit(text);
        String[] splitArr=text.split(" ");
        System.out.println("Arrays equal? "+compareArrays(myArr,splitArr));
        sc.close();
    }
}
