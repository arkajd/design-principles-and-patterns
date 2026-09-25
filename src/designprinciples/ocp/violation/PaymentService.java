package designprinciples.ocp.violation;

public class PaymentService {

    /* Notice the code smell here? It is the if-else block.
    *  If we wanted to add another payment type, we would add another else if block.
    *  Due to this we would make changes to existing functionality which might impact it.
    *  It would also impact the existing test cases. */

    public void processPayment(String paymentType, double amount) {
        if ("CREDIT_CARD".equalsIgnoreCase(paymentType)) {
            // Credit card specific logic
            System.out.println("Validating card number, CVV, and expiration date...");
            System.out.println("Charging $" + amount + " via Credit Card Gateway.");
        } else if ("PAYPAL".equalsIgnoreCase(paymentType)) {
            // PayPal specific logic
            System.out.println("Redirecting to PayPal login and token verification...");
            System.out.println("Executing PayPal API payment for $" + amount);
        } else if ("BANK_TRANSFER".equalsIgnoreCase(paymentType)) {
            // Direct debit logic
            System.out.println("Checking IBAN/Routing number and balance...");
            System.out.println("Initiating ACH/Wire transfer for $" + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }
}
