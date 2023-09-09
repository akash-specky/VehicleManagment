import customerpackage.Customer;
import customerpackage.GeneralCustomer;
import maintenance.CarMaintenanceTool;
import maintenance.MaintenanceTool;
import sales.Invoice;
import sales.SalesSystem;
import vehicles.Car;
import vehicles.Vehicle;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicleManagement = null;
        Customer customerManagement = null;
        MaintenanceTool maintenanceManagement = null;
        SalesSystem salesManagement = new SalesSystem();

        while (true) {
            System.out.println("MVMS Menu:");
            System.out.println("1. Create Customer");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Generate Invoice");
            System.out.println("4. Perform Maintenance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Create a customer
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer contact details: ");
                    String contactDetails = scanner.nextLine();
                    Customer newCustomer = new GeneralCustomer(customerName, contactDetails);
                    customerManagement.addCustomer(newCustomer);
                    break;
                case 2:
                    // Add a vehicle
                    System.out.print("Enter vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter vehicle make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter vehicle year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter vehicle price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter number of doors: ");
                    int numberOfDoors = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter transmission type: ");
                    String transmissionType = scanner.nextLine();
                    Vehicle newVehicle = new Car(model, make, year, price, numberOfDoors, transmissionType);
                    vehicleManagement.addVehicle(newVehicle);
                    break;

                case 3:
                    // Perform maintenance
                    System.out.print("Enter vehicle model for maintenance: ");
                    String vehicleModelForMaintenance = scanner.nextLine();
//                    Vehicle maintenanceVehicle = vehicleManagement.findVehicleByModel(vehicleModelForMaintenance);
//                    if (maintenanceVehicle != null) {
//                        maintenanceManagement.performMaintenance(maintenanceVehicle);
//                    } else {
//                        System.out.println("Vehicle not found.");
//                    }
                    System.out.println(vehicleModelForMaintenance);
                    break;
                case 5:
                    System.out.println("Exiting MVMS.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
