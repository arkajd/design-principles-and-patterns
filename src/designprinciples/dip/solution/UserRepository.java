package designprinciples.dip.solution;

public interface UserRepository {

    void save(String email, String name);
}
