package main;

import users.UserManager;

public class LoginSystem {
    public static void main(String[] args) {
        UserManager.LoginHandler loginHandler = new UserManager.LoginHandler();
        loginHandler.authenticateUser();
    }
}
