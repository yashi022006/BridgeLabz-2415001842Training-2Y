class CarRental {
    String customerName, carModel;
    int rentalDays;
    static final int COST_PER_DAY = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays +
                " days. Total Cost = " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Riya", "Honda City", 5);
        cr.display();
    }
}
