package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {

    private List<Vehicle> bikeList;
    public Bike(String model, String make, int year, double price, String transmissionType) {
        super(model, make, year, price, transmissionType);
        this.bikeList = new ArrayList<>();
    }

    @Override
    public double calculateMaintenanceCost() {
        return 1000;
    }


    public void addVehicle(Vehicle newVehicle) {
        bikeList.add(newVehicle);
    }

    public List<Vehicle> getBikeList() {
        return bikeList;
    }

//    @Override
//    public Vehicle findVehicleByModel(List<Vehicle> vehicles, String model) {
//        return null;
//    }


}
