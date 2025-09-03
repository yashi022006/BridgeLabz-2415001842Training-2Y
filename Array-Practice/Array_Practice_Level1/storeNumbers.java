package Array_Practice_Level1;

import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) break;

            nums[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Number: " + nums[i]);
            total += nums[i];
        }

        System.out.println("Total sum = " + total);
        sc.close();
    }
}
