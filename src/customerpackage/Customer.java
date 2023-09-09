package customerpackage;

import vehicles.Vehicle;

public interface Customer {
    String name();
//    Customer addCustomer(String name, String contactDetails);
    Customer addCustomerVIP(String name, String contactDetails,int lPoints);
    void inquireAboutVehicle(Vehicle vehicle);
    void scheduleTestDrive(Vehicle vehicle);
    void receiveMaintenanceReminder(Vehicle vehicle);
    Customer findCustomerByName(String name);

    void addCustomer(Customer newCustomer);
}
