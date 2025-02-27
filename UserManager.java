package users;

import util.PasswordValidator;
import java.io.Console;

public class UserManager {
    private static final String username = "username@gmail.com";
    private static final String password = "cui@lahore2000";

 
    public static class LoginHandler {
        public void authenticateUser() {
            Console console = System.console();
           return;
           }

            System.out.print("Enter username: ");
            String inputUsername = console.readLine();

            System.out.print("Enter password: ");
            String inputPassword = console.readPassword();
      


            if (inputUsername.equals(username) && inputPassword.equals(password) {
                System.out.println("Your ID is verifies.Welcome!");
            } else {
                System.out.println("Invalid credentials. Access denied.");
            }
        }
    }
}
