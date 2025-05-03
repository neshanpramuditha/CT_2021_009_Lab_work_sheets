package Q_05;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] burgers = {"1. Veggie Burger", "2. Chicken Burger", "3. Cheese Burger"};
        String[] drinks = {"1. Orange Juice", "2. Sprite", "3. Cocacola"};
        String[] desserts = {"1. Ice-cream", "2. Fruit Salad", "3. Brownies"};

        System.out.println("!....Welcome to MyJava Lo-Fat Burgers....!");
        System.out.println("\n---Burger Menu---");

        for (String burger : burgers){
            System.out.println(burger);
        }
        System.out.print("Please choose a burger [1 to 3]: ");
        int BurgChoice = scanner.nextInt();

        System.out.println("\n---Drinks Menu---");

        for (String drink: drinks){
            System.out.println(drink);
        }
        System.out.print("Please choose a drink [1 to 3]: ");
        int DrinkChoice = scanner.nextInt();

        System.out.println("\n---Desert Menu---");
        for (String desert : desserts){
            System.out.println(desert);
        }
        System.out.print("Please choose a desert [1 to 3]: ");
        int DesertChoice = scanner.nextInt();

        System.out.println("\n---This is your order---");
        System.out.println("\nBurger: " + burgers[BurgChoice - 1].substring(3));
        System.out.println("Drink: " + drinks[DrinkChoice - 1].substring(3));
        System.out.println("Desert: " + desserts[DesertChoice - 1].substring(3));//".substring(3)" - start from index 3, skipping over "1. "
        System.out.println("\n--Thank you--");

        scanner.close();

    }
}
