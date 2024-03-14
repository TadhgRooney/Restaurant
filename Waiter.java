package assignment3;

public class Waiter extends Thread {
    Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // Gets dishes from restaurant collection and passes to chef, starting chef thread
    // Waits while meal is being cooked
    public void run() {
        // Checks to see if list is empty, if it's not grabs a dish
        Dish dish = restaurant.getDish();
        if (dish != null) { // If dish is not empty
            // Waiter grabbed dish
            System.out.println("Waiter has grabbed dish: " + dish.getItem());
        } else { // If there are no dishes available
            System.out.println("No dishes available");
        }
    }
}
