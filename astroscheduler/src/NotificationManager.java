import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NotificationManager {
    // Timer instance to schedule task reminders
    private Timer timer;

    public NotificationManager() {
        this.timer = new Timer(true);
    }

    // Schedules a reminder for the specified task.

    public void scheduleReminder(Task task) {
        // Parse the task's start time
        LocalTime taskTime = LocalTime.parse(task.getStartTime(), DateTimeFormatter.ofPattern("HH:mm"));

        // Schedule a timer task to print a reminder message at the task's start time
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Reminder: " + task.getDescription() + " starts at " + task.getStartTime());
            }
        }, java.sql.Time.valueOf(taskTime).getTime());
    }
}
