package customerpackage;

import vehicles.Vehicle;

import java.util.List;

public class GeneralCustomer implements Customer{
    private String name;
    private String contactDetails;

    private List<Customer> customers;


    public GeneralCustomer(String name,String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }


    @Override
    public String name() {
        return name;
    }

//    @Override
//    public Customer addCustomer(String name, String contactDetails) {
//        Customer newCustomer = new GeneralCustomer(name, contactDetails);
//        customers.add(newCustomer);
//        return newCustomer;
//    }

    @Override
    public Customer addCustomerVIP(String name, String contactDetails, int lPoints) {
        return null;
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
        Customer add = new GeneralCustomer(name, contactDetails);
        customers.add(add);
//        return newCustomer;
    }
}
