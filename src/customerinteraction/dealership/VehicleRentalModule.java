package customerinteraction.dealership;

import customerpackage.Customer;
import vehicles.Vehicle;

public class VehicleRentalModule implements VehicleRental{
    @Override
    public void rentVehicle(Customer customer, Vehicle vehicle) {


        if (customer != null && vehicle != null) {

            System.out.println("Renting a vehicle to " + customer.name() +
                    " - Vehicle: " + vehicle.getModel() + " " + vehicle.getMake());

            vehicle.setRented(true);
        } else {
            System.out.println("Invalid customer or vehicle. Rental cannot be completed.");
        }
    }
}
