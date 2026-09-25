package designprinciples.ocp.solution;

public class PaymentService {

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }
        paymentMethod.pay(amount);
    }
}
