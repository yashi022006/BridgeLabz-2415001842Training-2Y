import java.util.Scanner;

public class Ques1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an integer number:");
        int num = sc.nextInt();
        Integer intObj = num;
        System.out.println(intObj);
        System.out.println(num);
        sc.close();
    }
}