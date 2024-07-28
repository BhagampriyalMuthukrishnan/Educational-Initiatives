import java.util.List;

public class FoodSchedule {
    // Constant representing the required number of meals per day
    private static final int MEALS_PER_DAY = 3;

    // Checks if the food schedule in the list of tasks meets the daily meal
    // requirement.
    public static boolean isFoodScheduleValid(List<Task> tasks) {
        // Calculate the number of meals by filtering tasks with descriptions matching
        // meal names
        long mealCount = tasks.stream()
                .filter(task -> task.getDescription().equalsIgnoreCase("breakfast") ||
                        task.getDescription().equalsIgnoreCase("lunch") ||
                        task.getDescription().equalsIgnoreCase("dinner"))
                .count();

        // Return true if the number of meals matches the required number
        return mealCount == MEALS_PER_DAY;
    }
}
