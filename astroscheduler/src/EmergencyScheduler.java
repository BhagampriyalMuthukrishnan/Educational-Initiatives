import java.util.ArrayList;
import java.util.List;

public class EmergencyScheduler {
    // List to store emergency tasks
    private List<Task> emergencyTasks;

    public EmergencyScheduler() {
        this.emergencyTasks = new ArrayList<>();
    }

    // Adds an emergency task to the list.
    public void addEmergencyTask(Task task) {
        emergencyTasks.add(task);
    }

    // Retrieves the list of emergency tasks.

    public List<Task> getEmergencyTasks() {
        return emergencyTasks;
    }
}
