package customerpackage;

import vehicles.Vehicle;

public interface Customer {
    String name();

    void inquireAboutVehicle(Vehicle vehicle);
    void scheduleTestDrive(Vehicle vehicle);
    void receiveMaintenanceReminder(Vehicle vehicle);

}
