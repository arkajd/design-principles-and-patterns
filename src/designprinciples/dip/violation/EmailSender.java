package designprinciples.dip.violation;

public class EmailSender {

    public void sendWelcomeEmail(String toEmail) {
        System.out.println("Connecting to SendGrid HTTP API to send welcome email to " + toEmail);
    }
}
