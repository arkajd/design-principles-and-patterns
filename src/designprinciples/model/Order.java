package designprinciples.model;

import java.util.List;

public class Order {
    private String customerEmail;
    private List<OrderItem> items;
    private double total;

    public Order(String customerEmail, List<OrderItem> items) {
        this.customerEmail = customerEmail;
        this.items = items;
    }

    public String getCustomerEmail() { return customerEmail; }
    public List<OrderItem> getItems() { return items; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
