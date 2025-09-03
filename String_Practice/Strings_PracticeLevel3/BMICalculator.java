package Strings_PracticeLevel3;
import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] result = computeData(data);
        display(result);
        sc.close();
    }

    static String[][] computeData(double[][] data) {
        String[][] res = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100.0;
            double bmi = w / (h * h);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            res[i][0] = String.valueOf(w);
            res[i][1] = String.valueOf(data[i][1]);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = status;
        }
        return res;
    }

    static void display(String[][] arr) {
        System.out.printf("%10s %10s %10s %15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%10s %10s %10s %15s\n", row[0], row[1], row[2], row[3]);
        }
    }
}

