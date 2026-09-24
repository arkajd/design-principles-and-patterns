package designprinciples.srp.solution;

import designprinciples.model.Order;

public class EmailNotificationService {

    public void sendOrderConfirmation(Order order) {
        System.out.println("Email sent to user with email " + order.getCustomerEmail());
    }
}
