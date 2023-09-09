package customerinteraction.dealership;

import customerpackage.Customer;
import vehicles.Vehicle;

public class MVMS {
    private VehicleRental vehicleRentalModule;
    private SecondHandVehicleSales secondHandVehicleSalesModule;

    public MVMS(VehicleRental vehicleRentalModule, SecondHandVehicleSales secondHandVehicleSalesModule) {
        this.vehicleRentalModule = vehicleRentalModule;
        this.secondHandVehicleSalesModule = secondHandVehicleSalesModule;
    }

    public void sellVehicle(Customer customer, Vehicle vehicle) {
        // Implementation for selling a new vehicle
    }

    public void rentVehicle(Customer customer, Vehicle vehicle) {
        if (vehicleRentalModule != null) {
            vehicleRentalModule.rentVehicle(customer, vehicle);
        }
    }

    public void sellSecondHandVehicle(Customer customer, Vehicle vehicle) {
        if (secondHandVehicleSalesModule != null) {
            secondHandVehicleSalesModule.sellSecondHandVehicle(customer, vehicle);
        }
    }
    }
