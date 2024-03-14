package assignment3;

import java.util.ArrayList;

public class Restaurant {
    // Collection to store dish objects
    ArrayList<Dish> list;

    public Restaurant() {
        list = new ArrayList<Dish>();
        Dish dish1 = new Dish(153, "Food item");
        // Dish dish2 = new Dish(167, "Food2"); Only want one right now
        list.add(dish1);
        // list.add(dish2); Only want one right now

        // for (Dish dish : list) { // for each loop to iterate through the list
        //     System.out.println("check to see if dish is added\n" + dish.getItem() + " , " + dish.getTableNumber());
        // }
    }

    public Dish getDish() {
        if (list.isEmpty()) { // If list is empty pass nothing
            return null;
        } else { // if list has something
            // System.out.println("First dish is " + list.get(0));
            Dish dish = list.remove(0); // remove first item of list
            return dish; // return dish
        }
    }

    public static void main(String args[]) {
        Restaurant restaurant = new Restaurant();
        Waiter waiter = new Waiter(restaurant);
        waiter.start();
    }
}
