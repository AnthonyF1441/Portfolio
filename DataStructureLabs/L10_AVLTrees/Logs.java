public class Logs {
    // variables
    String username = "";
    String task = "";
    int year = 0;
    // paramterized constructor
    Logs(String username, String task, int year)
    {
        this.username = username;
        this.task = task;
        this.year = year;
    }
    
    // tostring()
    public String toString() {
        return "Name: " + username + " | " + "Task: " + task + " | " + "Year: " + year + "\n";
    }
}
