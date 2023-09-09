package customerpackage;

import vehicles.Vehicle;

import java.util.List;

public class VIPCustomer implements Customer{

    private String name;
    private int loyaltyPoints;
    private String contactDetails;

    private List<Customer> customers;

    public VIPCustomer(String name, int loyaltyPoints,String contactDetails) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
        this.contactDetails = contactDetails;
    }


    @Override
    public String name() {
        return name;
    }



    @Override
    public Customer addCustomerVIP(String name, String contactDetails,int lPoints) {
        Customer newCustomer = new VIPCustomer(name,loyaltyPoints ,contactDetails);
        customers.add(newCustomer);
        return newCustomer;
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
    public Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.name().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void addCustomer(Customer newCustomer) {
        Customer ad = new VIPCustomer(name,loyaltyPoints ,contactDetails);
        customers.add(ad);
    }
}
