interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int speed, String model) {
        this.maxSpeed = speed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int speed, String model) {
        super(speed, model);
    }
    void charge() {
        System.out.println("Charging electric vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int speed, String model) {
        super(speed, model);
    }
    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda");
        ev.charge();
        pv.refuel();
    }
}
