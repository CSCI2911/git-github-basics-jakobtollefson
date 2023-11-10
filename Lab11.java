
import java.util.*;

public class Lab11 {

    /**
     * jakob tollefson 9 Nov, 2023 Create two arrays. One that is a String array
     * that will hold the names of 5 of your favorite Thanksgiving foods and
     * another array that holds the cost of the items. For example, Food array
     * could include: Turkey, Mashed Potatoes, Green Bean Casserole,
     * Cranberries, Pumpkin Pie Cost array could include: 19.99, 10.75, 12.53,
     * 10.01, 16.56 Create the following methods: 1. A void method called
     * printFood that takes in the food array and outputs the food items in the
     * array 2. A void method called printAll that takes in the food array and
     * the cost array and outputs the food items and cost. 3. A value returning
     * method called totalCost that takes in the cost array and returns the
     * total cost of all the food items. 4. A value returning method called
     * averageCost that takes in the cost array and returns the average cost of
     * the food items. 5. A value returning method called randomFoodItem that
     * takes in the food array and randomly selects a food item in the array.
     */
    public static void main(String[] args) {

        String[] food = {"Turkey", "Mashed Potatoes", "Green Bean Casserole", "Cranberries", "Pumpkin Pie"};
        double[] cost = {19.99, 10.75, 12.53, 10.01, 16.56};

        System.out.println("My favorite Thanksgiving Foods: ");
        printFood(food);
        System.out.println("Favorite Thanksgiving Foods and Cost");
        printAll(food, cost);
        System.out.printf("If I were to buy all of the Thanksgiving food items, it would cost me: $%,.2f", totalCost(cost));
        System.out.printf("\nThe average cost of the Thanksgiving food items: $%,.2f", averageCost(cost));
        System.out.println("\nSelecting a random Thanksgiving food item: " + randomFoodItem(food));

    }
//this method lists the favorite food items by bringing in the food array info

    public static void printFood(String[] food) {
        for (int x = 0; x < food.length; x++) {
            System.out.println(food[x]);
        }
    }
//this method prints all the foods and concurrent costs by bringing in both the food array info and the cost array info

    public static void printAll(String[] food, double[] cost) {
        for (int x = 0; x < cost.length; x++) {
            System.out.println(food[x] + "   $" + cost[x]);
        }
    }
// this method adds up the total cost of the food items that bring in the cost from the cost array

    public static double totalCost(double cost[]) {
        double totalCost = 0;

        for (int x = 0; x < cost.length; x++) {
            totalCost = totalCost + cost[x];
        }
        return totalCost;
    }

    //this method calculates the average cost by bringing in the costs of the food items from the cost array
    public static double averageCost(double cost[]) {
        double averageCost = 0;

        for (int x = 0; x < cost.length; x++) {
            averageCost = averageCost + cost[x];
        }
        averageCost = averageCost / 5;
        return averageCost;
    }

    // this method is selcted the food items that are set up by the food array in a random order.
    public static String randomFoodItem(String food[]) {
        Random foodItem = new Random();
        int t = foodItem.nextInt(4);

        return food[t];
    }

}
