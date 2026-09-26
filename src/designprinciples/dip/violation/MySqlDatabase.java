package designprinciples.dip.violation;

public class MySqlDatabase {

    public void saveUser(String email, String name) {
        System.out.println("Executing raw SQL: INSERT INTO users VALUES ('" + email + "', '" + name + "') in MySQL");
    }
}
