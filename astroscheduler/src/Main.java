import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Single instance of ScheduleManager (Singleton pattern)
        ScheduleManager manager = ScheduleManager.getInstance();

        // Instance of NotificationManager
        NotificationManager notificationManager = new NotificationManager(); // Now it should work

        // Instance of DailyReportGenerator
        DailyReportGenerator reportGenerator = new DailyReportGenerator();

        // Loop to show the menu and process user choices
        for (int i = 0; i < 15; i++) {
            showMenu(); // Display the menu
            int choice = scanner.nextInt(); // Get user choice
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a new task
                    addTask(scanner, manager);
                    manager.displayRemainingBreaksAndExercise();
                    break;
                case 2:
                    // Remove an existing task
                    removeTask(scanner, manager);
                    break;
                case 3:
                    // View all tasks
                    manager.viewTasks();
                    break;
                case 4:
                    // Toggle emergency mode
                    manager.toggleEmergencyMode();
                    break;
                case 5:
                    // Save tasks, generate report, and exit
                    FileManager.saveTasks(manager.getTasks());
                    manager.markTaskCompletion(scanner);
                    reportGenerator.generateReport(manager.getTasks());
                    System.out.println("Tasks saved. Daily report generated. Exiting...");
                    scanner.close();
                    return;
                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Method to display the menu options
    private static void showMenu() {
        System.out.println("\n1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Toggle Emergency Mode");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Method to add a new task
    private static void addTask(Scanner scanner, ScheduleManager manager) {
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter start time (HH:MM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter end time (HH:MM): ");
        String endTime = scanner.nextLine();
        System.out.print("Enter priority (High/Medium/Low): ");
        String priority = scanner.nextLine();
        System.out.print("Enter team members (comma separated): ");
        String teamMembers = scanner.nextLine();

        // New task using the TaskFactory
        Task task = TaskFactory.createTask(description, startTime, endTime, priority, teamMembers);

        // Add the task to the manager
        if (manager.addTask(task, scanner)) {
            System.out.println("Task added successfully. No conflicts.");
        }
    }

    // Method to remove an existing task
    private static void removeTask(Scanner scanner, ScheduleManager manager) {
        System.out.print("Enter task description to remove: ");
        String removeDesc = scanner.nextLine();

        // Remove the task from the manager
        if (manager.removeTask(removeDesc)) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // Method to mark a task as complete
    private static void markTaskCompletion(Scanner scanner, ScheduleManager manager) {
        System.out.print("Enter task description to mark as complete: ");
        String desc = scanner.nextLine();

    }
}
