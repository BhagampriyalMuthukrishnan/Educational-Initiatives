public class MainFoodService {
    public static void main(String[] args) {
        // Attempt to get the single instance of FoodService
        FoodService foodService1 = FoodService.getInstance();
        FoodService foodService2 = FoodService.getInstance();

        // Demonstrate that both references point to the same instance
        System.out.println("Are both references the same? " + (foodService1 == foodService2));

        // Use the FoodService instance
        foodService1.orderFood("Pizza");
        foodService2.orderFood("Burger");
    }
}