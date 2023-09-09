package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private List<Vehicle> additionalVehicles;

    public Car(String model, String make, int year, double price, int numberOfDoors, String transmissionType) {
        super(model, make, year, price, transmissionType);
        this.additionalVehicles = new ArrayList<>();
    }



    @Override
    public double calculateMaintenanceCost() {
        return 5000;
    }

    @Override
    public void addVehicle(Vehicle newVehicle) {
        additionalVehicles.add(newVehicle);
    }


    public String getNumberOfDoors() {
        return "4";
    }
}
