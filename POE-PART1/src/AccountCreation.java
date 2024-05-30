import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

//Create class AccouuntCreation
public class AccountCreation {
    private static final int MAX_USERNAME_LENGTH = 5;
    private static final String USERNAME_REGEX = "^[a-zA-Z_]{1," + MAX_USERNAME_LENGTH + "}_$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    
    private static String Name;
    private static String Surname;
    private static String Username;
    private static String Password;

    public static void main(String[] args) {
        Name = JOptionPane.showInputDialog("Enter your name:");
        if (Name == null) return;

        Surname = JOptionPane.showInputDialog("Enter your surname:");
        if (Surname == null) return;

        Username = JOptionPane.showInputDialog("Enter your username (no more than 5 characters and must contain an underscore at the end):");
        if (Username == null) return;

        //Sign Up for the application
        if (isValidUsername(Username)) {
            JOptionPane.showMessageDialog(null, "Username successfully captured.");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore at the end and is no more than " + MAX_USERNAME_LENGTH + " characters in length.");
            return;
        }

        Password = JOptionPane.showInputDialog("Enter your password (must contain at least 8 characters, a capital letter, a number, and a special character):");
        if (Password == null) return;

        if (isValidPassword(Password)) {
            JOptionPane.showMessageDialog(null, "Password successfully captured.");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return;
        }

        //Login into the application
        String usernameInput = JOptionPane.showInputDialog("Enter your Username:");
        if (usernameInput == null) return;

        if (isValidUsername(usernameInput)) {
            String passwordInput = JOptionPane.showInputDialog("Enter your Password:");
            if (passwordInput == null) return;

            if (authenticate(usernameInput, passwordInput)) {
                JOptionPane.showMessageDialog(null, "Welcome " + getFirstName() + " " + getLastName() + ", it is great to see you again.");
                EasyKanban easykanban = new EasyKanban(usernameInput, passwordInput);
                easykanban.authenticate();
            } else {
                JOptionPane.showMessageDialog(null, "Authentication failed. Please check your username and password.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted.");
        }
    }

    private static boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }

    private static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    private static boolean authenticate(String username, String password) {
        // Replace this with your own authentic login
        return username.equals(Username) && password.equals(Password);
    }

    private static String getFirstName() {
        return Name;
    }

    private static String getLastName() {
        return Surname;
    }
}



//REFERENCES 
//W3Schools.com. (n.d.). Java Strings. W3Schools.com. Retrieved from https://www.w3schools.com/java/java_strings.asp 
//Bro Code. (2020). Java login system [Online video]. YouTube. Retrieved from https://www.youtube.com/watch?v=Hiv3gwJC5kw