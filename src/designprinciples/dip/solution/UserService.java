package designprinciples.dip.solution;

public class UserService {

    private final UserRepository userRepository;
    private final EmailService emailService;

    // Constructor Injection
    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void register(String email, String name) {
        userRepository.save(email, name);
        emailService.sendWelcomeEmail(email);
    }
}
