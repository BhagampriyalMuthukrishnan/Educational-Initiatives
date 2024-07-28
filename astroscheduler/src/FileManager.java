import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    // Path to the file where the tasks will be saved
    private static final String FILE_PATH = "tasks.txt";

    // Saves the list of tasks to a file.
    public static void saveTasks(List<Task> tasks) {
        // Try-with-resources to ensure the BufferedWriter is closed properly
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            // Writing each task to the file
            for (Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            // Print an error message if an IOException occurs
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
}
