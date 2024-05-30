import javax.swing.JOptionPane;

//Create class account
public class Account { 
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
        return "User registered successfully.";
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getFirstName() {
        return username.split("_")[0];
    }

    public String getLastName() {
        return username.split("_")[1];
    }

    public String returnLoginStatus(boolean isAuthenticated) {
        if (isAuthenticated) {
            return "Welcome " + getFirstName() + " " + getLastName() + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        Account account = new Account(username, password);

        JOptionPane.showMessageDialog(null, account.registerUser());

        username = JOptionPane.showInputDialog("Enter your username:");
        password = JOptionPane.showInputDialog("Enter your password:");
        
        boolean isAuthenticated = account.loginUser(username, password);
        String status = account.returnLoginStatus(isAuthenticated);

        JOptionPane.showMessageDialog(null, status);
    } 
}


//REFERENCES
//Nanyang Technological University. (n.d.). Nanyang Technological University. Retrieved from https://www3.ntu.edu.sg/
//Java Guides. (2020). Java GUI account code - YouTube. Retrieved from https://www.youtube.com/watch?v=mgw1sAvhjy8