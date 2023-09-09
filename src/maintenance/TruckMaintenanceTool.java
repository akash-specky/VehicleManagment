package maintenance;

import vehicles.Truck;
import vehicles.Vehicle;

public class TruckMaintenanceTool implements MaintenanceTool {
    @Override
    public void performMaintenance(Vehicle vehicle) {
        if (vehicle != null) {
            Truck truck = (Truck) vehicle;

            System.out.println("Performing maintenance on a truck: Checking engine, suspension, and brakes."+truck.getModel());
        } else {
            throw new IllegalArgumentException("Invalid vehicle type for truck maintenance.");
        }
    }
}
