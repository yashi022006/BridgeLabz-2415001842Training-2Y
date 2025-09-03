package Array_Practice_Level2;

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double w, h;
            do {
                System.out.println("Enter positive weight (kg) and height (m) for person " + (i + 1) + ":");
                w = sc.nextDouble();
                h = sc.nextDouble();
            } while (w <= 0 || h <= 0);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.println("Height=" + personData[i][1] + " Weight=" + personData[i][0] +
                    " BMI=" + personData[i][2] + " Status=" + status[i]);
        }
        sc.close();
    }
}

