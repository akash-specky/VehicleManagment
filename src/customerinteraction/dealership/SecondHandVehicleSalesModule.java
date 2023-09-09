package customerinteraction.dealership;

import customerpackage.Customer;
import vehicles.Vehicle;

public class SecondHandVehicleSalesModule implements SecondHandVehicleSales {
    @Override
    public void sellSecondHandVehicle(Customer customer, Vehicle vehicle) {
        if (customer != null && vehicle != null) {

            System.out.println("Selling a second-hand vehicle to " + customer.name() +
                    " - Vehicle: " + vehicle.getModel() + " " + vehicle.getMake());

             vehicle.setSold(true);

        } else {
            System.out.println("Invalid customer or vehicle. Sale cannot be completed.");
        }
    }
}
