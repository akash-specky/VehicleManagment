package sales;

import customerpackage.Customer;
import vehicles.Vehicle;

public class SalesSystem {
    public Invoice generateInvoice(Customer customer, Vehicle vehicle) {
        Invoice invoice = new Invoice(customer,vehicle, vehicle.getPrice());
        invoice.setCustomer(customer);
        invoice.setVehicle(vehicle);
        double totalPrice = calculateTotalPrice(vehicle);
        invoice.setTotalPrice(totalPrice);
        return invoice;
    }

    private double calculateTotalPrice(Vehicle vehicle) {

        double basePrice = vehicle.getPrice();
        double additionalCharges = 1000.0; // Additional charges (example)
        return basePrice + additionalCharges;
    }
}
