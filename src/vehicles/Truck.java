package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Vehicle{
    private List<Vehicle> additionalVehicles;

    public Truck(String model, String make, int year, double price, String transmissionType) {
        super(model, make, year, price, transmissionType);
        this.additionalVehicles = new ArrayList<>();
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0;
    }

    @Override
    public void addVehicle(Vehicle newVehicle) {
        additionalVehicles.add(newVehicle);
    }

//    @Override
//    public Vehicle findVehicleByModel(List<Vehicle> vehicles, String model) {
//        return null;
//    }
}
