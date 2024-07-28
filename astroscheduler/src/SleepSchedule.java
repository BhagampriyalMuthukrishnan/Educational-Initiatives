import java.time.LocalTime;

public class SleepSchedule {
    // Constants defining the start and end times for sleep
    private static final LocalTime SLEEP_START = LocalTime.of(21, 30); // 9:30 PM
    private static final LocalTime SLEEP_END = LocalTime.of(6, 0); // 6:00 AM

    // Method to check if a given time falls within the sleep period
    public static boolean isSleepTime(LocalTime time) {
        // Returns true if the time is after or equal to SLEEP_START (9:30 PM) or before
        // or equal to SLEEP_END (6:00 AM)
        return !time.isBefore(SLEEP_START) || !time.isAfter(SLEEP_END);
    }

    // Method to validate if a task's start and end times are outside the sleep
    // period
    public static boolean isValidTaskTime(LocalTime startTime, LocalTime endTime) {
        // Returns true if neither the start time nor the end time fall within the sleep
        // period
        return !isSleepTime(startTime) && !isSleepTime(endTime);
    }
}
