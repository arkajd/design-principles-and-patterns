package designprinciples.srp.solution;

public class OrderPricingCalculator {

    public double calculateTotal(Order order) {
        System.out.println("Calculate order total after applying discount.");
        return order.getTotal();
    }
}
