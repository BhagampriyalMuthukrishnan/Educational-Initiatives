import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MedicalCheckupScheduler {
    // Representing the valid start and end times for medical checkups
    private static final LocalTime CHECKUP_START_TIME = LocalTime.of(10, 0);
    private static final LocalTime CHECKUP_END_TIME = LocalTime.of(11, 0);

    public static boolean isCheckupScheduled(List<Task> tasks) {
        // Check if any task is a medical checkup and if its time is valid
        return tasks.stream()
                .anyMatch(task -> task.getDescription().equalsIgnoreCase("medical checkup") &&
                        isMedicalCheckupTimeValid(task));
    }

    // Validates if the task's start time falls within the valid medical checkup
    // time range.
    private static boolean isMedicalCheckupTimeValid(Task task) {
        // Parse the task's start time
        LocalTime startTime = LocalTime.parse(task.getStartTime(), DateTimeFormatter.ofPattern("HH:mm"));
        // Check if the start time is within the valid range
        return !startTime.isBefore(CHECKUP_START_TIME) && !startTime.isAfter(CHECKUP_END_TIME);
    }
}
