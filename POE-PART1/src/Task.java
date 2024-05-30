public class Task {
    private char taskStatus;
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;

    public char getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(char taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(0, 3).toUpperCase();
    }

    public String printTaskDetails() {
        String details = "Task Status: " + taskStatus + "\n";
        details += "Developer Details: " + developerDetails + "\n";
        details += "Task Number: " + taskNumber + "\n";
        details += "Task Name: " + taskName + "\n";
        details += "Task Description: " + taskDescription + "\n";
        details += "Task ID: " + taskID.toUpperCase() + "\n";
        details += "Duration: " + taskDuration + " hours\n";
        return details;
    }

    public int returnTotalHours() {
        return taskDuration;
    }
}
