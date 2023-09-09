package sales;

import customerpackage.Customer;
import vehicles.Vehicle;

import java.util.Date;

public class Invoice {

    private Customer customer;
    private Vehicle vehicle;
    private Date invoiceDate;
    private double totalPrice;
    private boolean isPaid;

    public Invoice(Customer customer, Vehicle vehicle, double totalPrice) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.totalPrice = totalPrice;
        this.invoiceDate = new Date(); // Set the current date as the invoice date
        this.isPaid = false; // Initialize as unpaid
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer +
                ", vehicle=" + vehicle +
                ", invoiceDate=" + invoiceDate +
                ", totalPrice=" + totalPrice +
                ", isPaid=" + isPaid +
                '}';
    }

    public Invoice generateInvoice(Order order) {

        System.out.println("Invoice:");
        System.out.println("Order Date: " + order.getOrderDate());
//        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Vehicle: " + order.getVehicle().getModel() + " " + order.getVehicle().getMake());
        System.out.println("Total Price: $" + order.getTotalPrice());
        // Additional invoice details can be added

        return this;
    }
}
