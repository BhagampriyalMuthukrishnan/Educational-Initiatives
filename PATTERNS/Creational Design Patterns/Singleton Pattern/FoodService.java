public class FoodService {
    // Step 1: Create a private static instance of the class
    private static FoodService instance;

    // Step 2: Private constructor to prevent instantiation from other classes
    private FoodService() {
        // Initialize the food service, if needed
        System.out.println("FoodService instance created.");
    }

    // Step 3: Public static method to provide access to the single instance
    public static synchronized FoodService getInstance() {
        if (instance == null) {
            instance = new FoodService();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void orderFood(String foodItem) {
        System.out.println("Ordering food item: " + foodItem);
    }
}