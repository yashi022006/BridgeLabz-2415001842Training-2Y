package Array_Practice_Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0, temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;
        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed number: ");
        for (int d : digits) {
            System.out.print(d);
        }
        sc.close();
    }
}

