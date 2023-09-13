import customerpackage.GeneralCustomer;
import vehicles.Bike;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bike myBike = new Bike("Mountain Bike", "Trek", 2022, 800.0, "Manual");




        System.out.println("Additional Vehicles of the Bike:");
        for (Vehicle vehicle : myBike.getBikeList()) {
            System.out.println("Make: " + vehicle.getMake());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            System.out.println("Price: $" + vehicle.getPrice());
            System.out.println("Transmission Type: " + vehicle.getTransmissionType());
            System.out.println();
        }

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
                    GeneralCustomer newCustomer = new GeneralCustomer();
                    newCustomer.addCustomer(customerName, contactDetails);
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
                    Car newVehicle = new Car(model, make, year, price, numberOfDoors, transmissionType);
                    newVehicle.addVehicle(newVehicle);
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




