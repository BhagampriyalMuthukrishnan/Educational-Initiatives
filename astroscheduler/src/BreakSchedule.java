import java.util.List;

public class BreakSchedule {
    // Constant representing the required number of breaks per day
    private static final int BREAKS_PER_DAY = 2;

    // Checks if the schedule contains the minimum required number of breaks.

    public static boolean isBreakScheduleValid(List<Task> tasks) {
        // Counts the number of tasks that are breaks
        long breakCount = tasks.stream()
                .filter(task -> task.getDescription().equalsIgnoreCase("break"))
                .count();

        // Returns true if the break count is greater than or equal to the required
        // breaks per day
        return breakCount >= BREAKS_PER_DAY;
    }
}
