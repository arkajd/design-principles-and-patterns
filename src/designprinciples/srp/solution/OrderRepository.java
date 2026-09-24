package designprinciples.srp.solution;

import designprinciples.model.Order;

public class OrderRepository {

    public void save(Order order) {
        System.out.println("Order saved to database.");
    }
}
