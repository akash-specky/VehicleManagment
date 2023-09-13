package customerpackage;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VIPCustomer implements VIPCustomerInterface,Customer{

    private String name;
    private int loyaltyPoints;
    private String contactDetails;

    private List<VIPCustomer> customers;

    public VIPCustomer(String name,String contactDetails, int loyaltyPoints) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
        this.contactDetails = contactDetails;
        customers = new ArrayList<>();
    }


    @Override
    public String name() {
        return name;
    }



    @Override
    public void inquireAboutVehicle(Vehicle vehicle) {
        System.out.println(name + " is inquiring about the " + vehicle.getModel() + " " + vehicle.getMake() + ".");
    }

    @Override
    public void scheduleTestDrive(Vehicle vehicle) {
        System.out.println(name + " is scheduling a test drive for the " + vehicle.getModel() + " " + vehicle.getMake() + ".");

    }

    @Override
    public void receiveMaintenanceReminder(Vehicle vehicle) {
        System.out.println(name + " received a maintenance reminder for the " + vehicle.getModel() + " " + vehicle.getMake() + ".");

    }

    @Override
    public String vipDiscount() {
        return null;
    }

    @Override
    public VIPCustomer addCustomer(String name, String contactDetails, int lPoint) {
        VIPCustomer customer = new VIPCustomer(name,contactDetails,lPoint);
        customers.add(customer);
        return customer;
    }
}
