import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private String priority;
    private String teamMembers;
    private boolean isComplete;

    // Constructor that validates and initializes the task attributes
    public Task(String description, String startTime, String endTime, String priority, String teamMembers) {
        TaskValidator.validate(description, startTime, endTime, priority); // Validate input
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.teamMembers = teamMembers;
        this.isComplete = false; // Initially, the task is not complete
    }

    // Getters for the task attributes
    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    public String getTeamMembers() {
        return teamMembers;
    }

    public boolean isComplete() {
        return isComplete;
    }

    // Setter to mark the task as complete or incomplete
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    // Override the toString method to provide a readable representation of the task
    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]";
    }

    // Inner class to handle validation of task attributes
    static class TaskValidator {
        // Validate the task attributes
        public static void validate(String description, String startTime, String endTime, String priority) {
            // Check if the description is valid
            if (description == null || description.isEmpty()) {
                throw new IllegalArgumentException("Description cannot be null or empty");
            }

            // Check if the start time is valid
            if (!isValidTime(startTime)) {
                throw new IllegalArgumentException("Invalid start time");
            }

            // Check if the end time is valid
            if (!isValidTime(endTime)) {
                throw new IllegalArgumentException("Invalid end time");
            }

            // Check if the priority is valid
            if (!isValidPriority(priority)) {
                throw new IllegalArgumentException("Invalid priority");
            }
        }

        // Check if the time is in the correct format (HH:mm)
        private static boolean isValidTime(String time) {
            try {
                LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
                return true;
            } catch (DateTimeParseException e) {
                return false;
            }
        }

        // Check if the priority is one of the accepted values
        private static boolean isValidPriority(String priority) {
            return priority.equalsIgnoreCase("High") ||
                    priority.equalsIgnoreCase("Medium") ||
                    priority.equalsIgnoreCase("Low");
        }
    }
}
