package designprinciples.srp.solution;

import designprinciples.model.Order;

public class OrderPricingCalculator {

    public double calculateTotal(Order order) {
        System.out.println("Calculate order total after applying discount.");
        return order.getTotal();
    }
}
