package util;

public class PasswordValidator {
    public class PasswordChecker {
        public boolean validatePassword(String inputPassword, String actualPassword) {
            return inputPassword.equals(actualPassword);
        }
    }
}
