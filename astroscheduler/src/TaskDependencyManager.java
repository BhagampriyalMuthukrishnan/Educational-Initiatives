import java.util.HashMap;
import java.util.Map;

public class TaskDependencyManager {
    private Map<String, String> dependencies;

    public TaskDependencyManager() {
        this.dependencies = new HashMap<>();
    }

    // Adds a dependency where 'task' depends on 'dependentTask'
    public void addDependency(String task, String dependentTask) {
        dependencies.put(task, dependentTask);
    }

    // Checks if 'dependentTask' is allowed to be added based on the dependency of
    // 'task'
    public boolean isTaskAllowed(String task, String dependentTask) {
        return dependencies.getOrDefault(task, "").equals(dependentTask);
    }
}