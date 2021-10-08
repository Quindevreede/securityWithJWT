package nl.gettoworktogether.security_with_jwt.exceptions;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String username) {
        super("Cannot find user " + username);
    }

    public UserNotFoundException() {
        super("User not found.");
    }

}
