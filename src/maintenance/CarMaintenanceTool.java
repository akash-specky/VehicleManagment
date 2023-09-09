package maintenance;

import vehicles.Car;
import vehicles.Vehicle;

public class CarMaintenanceTool implements MaintenanceTool {
    @Override
    public void performMaintenance(Vehicle vehicle) {
        if (vehicle != null) {
            Car car = (Car) vehicle;
            // Implement car-specific maintenance procedures
            System.out.println("Performing maintenance on a car: Checking oil, brakes, and tires.");
        } else {
            throw new IllegalArgumentException("Invalid vehicle type for car maintenance.");
        }
    }
}
