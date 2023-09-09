package sales;

import customerpackage.Customer;
import vehicles.Vehicle;

public class Order {

    private Customer customer;



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    private Vehicle vehicle;
    private double totalPrice; // Total price of the order
    private String orderDate; // Date of the order

    public Order(Customer customer, Vehicle vehicle, double totalPrice, String orderDate) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }


}
