import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EasyKanban {
    private static List<Task> tasks = new ArrayList<>();
    private static int numTasks;

    private static String Name;
    private static String Surname;
    private static String Username;
    private static String Password;

    public EasyKanban(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        boolean loggedIn = authenticate();
        if (loggedIn) {
            displayOptions();
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed. Exiting.");
            System.exit(0);
        }
    }
    
    public void displayOptions() {
        int choice;
        do {
            choice = displayMenu();
            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public boolean authenticate() {
        String username = JOptionPane.showInputDialog(null, "Enter your username:");
        String password = JOptionPane.showInputDialog(null, "Enter your password:");

        //Create an if statement to check username and password
        if (Username.equals(username) && Password.equals(password)) {
            JOptionPane.showMessageDialog(null, "Authentication successful");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
            return false;
        }
    }

    public int displayMenu() {
        String menu = "1. Add tasks\n2. Show report\n3. Quit";
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    }

    public void addTasks() {
        numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks to add"));
        for (int i = 0; i < numTasks; i++) {
            Task task = new Task();
            task.setTaskName(JOptionPane.showInputDialog(null, "Enter task name"));
            task.setTaskNumber(i);
            task.setTaskDescription(JOptionPane.showInputDialog(null, "Enter task description"));
            while (task.getTaskDescription().length() > 50) {
                JOptionPane.showMessageDialog(null, "Task description should not be more than 50 characters");
                task.setTaskDescription(JOptionPane.showInputDialog(null, "Enter task description"));
            }
            task.setDeveloperDetails(JOptionPane.showInputDialog(null, "Enter developer details"));
            task.setTaskDuration(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter task duration in hours")));
            task.setTaskStatus(JOptionPane.showInputDialog(null, "Enter task status\n1. To Do\n2. Done\n3. Doing").charAt(0));
            task.setTaskID(createTaskID(task.getTaskName(), task.getTaskNumber(), task.getDeveloperDetails()));
            JOptionPane.showMessageDialog(null, printTaskDetails(task));
            tasks.add(task);
        }
    }

    private static String createTaskID(String taskName, int taskNumber, String developerDetails) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(0, 3).toUpperCase();
    }

    private String printTaskDetails(Task task) {
        String details = "Task Status: " + task.getTaskStatus() + "\n";
        details += "Developer Details: " + task.getDeveloperDetails() + "\n";
        details += "Task Number: " + task.getTaskNumber() + "\n";
        details += "Task Name: " + task.getTaskName() + "\n";
        details += "Task Description: " + task.getTaskDescription() + "\n";
        details += "Task ID: " + task.getTaskID();
        return details;
    }

    public static void main(String[] args) {
        // Replace this with the appropriate credentials
        new EasyKanban("username", "password");
    }
}

//REFERENCES
//Mugabo, S., 2023. *How to Create an Array in Java*. freeCodeCamp. Available at: <https://www.freecodecamp.org/news/how-to-create-an-array-in-java/>
//Stack Overflow. (2013). Java application to provide a menu of different options. [online] Available at: https://stackoverflow.com/questions/20484088/java-application-to-provide-a-menu-of-different-options