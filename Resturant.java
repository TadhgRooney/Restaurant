package assignment3;

import java.util.ArrayList;

public class Resturant {

    //Collection to store dish objects

    ArrayList<Dish> list;

    int tableNumber = 153;
    String item = "Soup Sandwich";
    boolean ready = false;

    Dish dish;

    public Resturant(){

        list = new ArrayList<Dish>();

        dish = new Dish(tableNumber, item);

        list.add(dish);

        //System.out.println("Check if Dish is added" + list);
    }

    

    public static void main(String args[]){

        Resturant resturant = new Resturant();
    }




    
    
}
