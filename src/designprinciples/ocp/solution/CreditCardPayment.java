package designprinciples.ocp.solution;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Validating card number, CVV, etc.");
        System.out.println("Charging " + amount + " via credit card.");
    }
}
