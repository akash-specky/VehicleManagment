package vehicles;

import maintenance.MaintenanceTool;

import java.util.List;

public abstract class Vehicle {
    private String model;
    private String make;
    private int year;
    private double price;
    private boolean rented;
    private boolean sold;
    private String transmissionType;

    public Vehicle(String model, String make, int year, double price, String transmissionType) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
        this.transmissionType = transmissionType;
        this.rented = false; // Initialize rented status to false
        this.sold = false; // Initialize sold status to false
    }

    // Getter and setter methods for model, make, year, price, transmissionType

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }


    public abstract double calculateMaintenanceCost();


    public void performMaintenance(MaintenanceTool maintenanceTool) {
        maintenanceTool.performMaintenance(this);
    }





}
