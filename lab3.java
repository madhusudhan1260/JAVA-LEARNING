import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String array of size 10
        String[] restaurants = new String[10];

        // Taking restaurant names
        System.out.println("Enter 10 restaurant names:");

        for (int i = 0; i < restaurants.length; i++) {
            System.out.print("Restaurant " + (i + 1) + ": ");
            restaurants[i] = sc.nextLine();
        }

        // Display available restaurant list
        System.out.println("\n----- Available Restaurants -----");

        for (int i = 0; i < restaurants.length; i++) {
            System.out.println((i + 1) + ". " + restaurants[i]);
        }

        // Total number of restaurants
        System.out.println("\nTotal number of restaurants: " + restaurants.length);

        // Search restaurant
        System.out.print("\nEnter restaurant name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < restaurants.length; i++) {

            if (restaurants[i].equalsIgnoreCase(search)) {
                System.out.println("Restaurant found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Restaurant not found.");
        }

        // Find restaurant with longest name
        String longest = restaurants[0];

        for (int i = 1; i < restaurants.length; i++) {

            if (restaurants[i].length() > longest.length()) {
                longest = restaurants[i];
            }
        }

        System.out.println("\nRestaurant with the longest name: " + longest);
        System.out.println("Length of the name: " + longest.length());

        sc.close();
    }
}