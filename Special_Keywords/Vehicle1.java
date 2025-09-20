class Vehicle {
    private static double registrationFee = 5000;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class Vehicle1{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anil", "Car", "DL10C1234");
        v1.displayVehicle();

        Vehicle.updateRegistrationFee(6000);
        Vehicle v2 = new Vehicle("Sunita", "Bike", "DL5S5678");
        v2.displayVehicle();
    }
}

