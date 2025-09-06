public class UnitConverter {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double m) { return m * 1.60934; }
    public static double convertMetersToFeet(double m) { return m * 3.28084; }
    public static double convertFeetToMeters(double f) { return f * 0.3048; }
    public static double convertYardsToFeet(double y) { return y * 3; }
    public static double convertFeetToYards(double f) { return f * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double i) { return i * 0.0254; }
    public static double convertInchesToCm(double i) { return i * 2.54; }
    public static double convertFToC(double f) { return (f - 32) * 5 / 9; }
    public static double convertCToF(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double p) { return p * 0.453592; }
    public static double convertKgToPounds(double k) { return k * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.println("5. Meters to Feet");
        System.out.println("6. Feet to Meters");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println(convertKmToMiles(km) + " miles");
                break;
            case 2:
                System.out.print("Enter miles: ");
                double miles = sc.nextDouble();
                System.out.println(convertMilesToKm(miles) + " km");
                break;
            case 3:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                System.out.println(convertCToF(c) + " Fahrenheit");
                break;
            case 4:
                System.out.print("Enter Fahrenheit: ");
                double f = sc.nextDouble();
                System.out.println(convertFToC(f) + " Celsius");
                break;
            case 5:
                System.out.print("Enter meters: ");
                double m = sc.nextDouble();
                System.out.println(convertMetersToFeet(m) + " feet");
                break;
            case 6:
                System.out.print("Enter feet: ");
                double ft = sc.nextDouble();
                System.out.println(convertFeetToMeters(ft) + " meters");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
