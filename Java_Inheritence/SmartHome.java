class Device {
    String deviceId, status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("D1001", "ON", 24);
        t.displayStatus();
    }
}

