class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) {
        super(msg);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) {
        super(msg);
    }
}

class Vehicle {
    public void checkMaintenance(int mileage, boolean isOverdue)
            throws ServiceOverdueException, InvalidMileageException {

        if (mileage < 0) {
            throw new InvalidMileageException("Mileage cannot be negative!");
        }

        if (isOverdue) {
            throw new ServiceOverdueException("Service date is overdue!");
        }

        System.out.println("Vehicle maintenance is up to date.");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        try {
            v.checkMaintenance(12000, true);
        } catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

