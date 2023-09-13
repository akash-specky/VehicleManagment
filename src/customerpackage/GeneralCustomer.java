package customerpackage;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GeneralCustomer implements GeneralCustomerInterface,Customer{
    private String name;
    private String contactDetails;

    private List<GeneralCustomer> customers;


    public GeneralCustomer(String name,String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public GeneralCustomer() {
        customers = new ArrayList<>();

    }


    @Override
    public String name() {
        return name;
    }


    public GeneralCustomer addCustomer(String name, String contactDetails) {
        GeneralCustomer newCustomer = new GeneralCustomer(name, contactDetails);
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

}
