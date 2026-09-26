package designprinciples.dip.violation;

// High-level business logic
public class UserService {

    private MySqlDatabase database;
    private EmailSender emailer;

    public UserService() {
        // CODE SMELL: High-level class directly instantiates concrete low-level implementations
        this.database = new MySqlDatabase();    // Low-level database client
        this.emailer = new EmailSender();       // Low-level notification tool
    }

    public void register(String email, String name) {
        // Business logic is tightly coupled to MySQL and Sender
        database.saveUser(email, name);
        emailer.sendWelcomeEmail(email);
    }
}
