package Interfaces;

interface Alert {
    void test(int currentTemp);
}

public class TemperatureAlert {
    public static void main(String[] args) {
        Alert highTemp = (temp) -> {
            if (temp > 40) {
                System.out.println(" Alert! Temperature crossed threshold.");
            } else {
                System.out.println("Temperature is normal.");
            }
        };

        // Test different temperatures
        highTemp.test(34);
        highTemp.test(45);
    }
}
