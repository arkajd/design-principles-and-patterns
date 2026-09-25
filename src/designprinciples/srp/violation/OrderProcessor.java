package designprinciples.srp.violation;

import designprinciples.srp.solution.Order;
import designprinciples.srp.solution.OrderItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderProcessor {

    public void processOrder(Order order) throws Exception {
        // 1. Validation & Pricing Logic
        if (order.getItems() == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item.");
        }

        double total = 0.0;
        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        // Business rule: 10% discount for orders over $100
        if (total > 100.0) {
            total = total * 0.90;
        }
        order.setTotal(total);

        // 2. Database Persistence Logic (Raw JDBC)
        String url = "jdbc:postgresql://localhost:5432/storedb";
        try (Connection conn = DriverManager.getConnection(url, "postgres", "secret")) {
            String sql = "INSERT INTO orders (customer_email, total) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, order.getCustomerEmail());
                stmt.setDouble(2, order.getTotal());
                stmt.executeUpdate();
            }
        }

        // 3. Email Notification Logic (JavaMail)
        System.out.println("Connecting to smtp.mailserver.com on port 587...");
        System.out.println("Sending email from orders@store.com to: " + order.getCustomerEmail());
        System.out.println("Subject: Order Confirmation");
        System.out.println("Body: Thank you! Your total is $" + order.getTotal());
    }
}
