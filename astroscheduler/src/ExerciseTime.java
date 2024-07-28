import java.util.List;

public class ExerciseTime {
    // Constant representing the minimum required exercise minutes per day
    private static final int MIN_EXERCISE_MINUTES = 120;

    // Checks if the total exercise time in the list of tasks meets the minimum
    // requirement.

    public static boolean isExerciseTimeSufficient(List<Task> tasks) {
        // Calculate the total exercise minutes
        int totalExerciseMinutes = tasks.stream()
                .filter(task -> task.getDescription().equalsIgnoreCase("exercise"))
                .mapToInt(task -> calculateMinutes(task.getStartTime(), task.getEndTime()))
                .sum();

        // Returns true if the total exercise minutes meet or exceed the minimum
        // requirement
        return totalExerciseMinutes >= MIN_EXERCISE_MINUTES;
    }

    // Calculates the duration in minutes between the start and end times.

    private static int calculateMinutes(String startTime, String endTime) {
        // Split the start time and end time into hours and minutes
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        // Parse the hours and minutes
        int startHour = Integer.parseInt(start[0]);
        int startMinute = Integer.parseInt(start[1]);
        int endHour = Integer.parseInt(end[0]);
        int endMinute = Integer.parseInt(end[1]);

        // Calculate and return the duration in minutes
        return (endHour - startHour) * 60 + (endMinute - startMinute);
    }
}
