package programming_elements_level1;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.4516; // 1 in² = 6.4516 cm²
        System.out.println("The area of triangle is " + areaCm2 + " cm² and " + areaInches2 + " in²");
        input.close();
    }
}
