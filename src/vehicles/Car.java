package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private List<Vehicle> carList;

    public Car(String model, String make, int year, double price, int numberOfDoors, String transmissionType) {
        super(model, make, year, price, transmissionType);
        this.carList = new ArrayList<>();
    }



    @Override
    public double calculateMaintenanceCost() {
        return 5000;
    }


    public void addVehicle(Vehicle newVehicle) {
        carList.add(newVehicle);
    }


    public List<Vehicle> getCarList() {
        return carList;
    }
}
