class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class Login {
    private String validUser = "admin";
    private String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Username or password incorrect!");
        }
        System.out.println("Login successful!");
    }
}

public class LoginMain {
    public static void main(String[] args) {
        Login login = new Login();

        try {
            login.validate("admin", "12xx");
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
        }
    }
}

