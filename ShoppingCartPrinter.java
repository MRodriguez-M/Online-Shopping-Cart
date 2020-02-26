import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String productName = "";
        int productPrice = 0;
        int productQuantity = 0;
        // Create instances of ItemToPurchase for each item
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Prompt user for name, price, and quantity for item 1
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        productName = scnr.nextLine();
        item1.setName(productName);
        System.out.print("Enter the item price: ");
        productPrice = scnr.nextInt();
        item1.setPrice(productPrice);
        System.out.print("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        item1.setQuantity(productQuantity);

        // Prompt user for name, price, and quantity for item 2
        System.out.println("\nItem 2");
        System.out.print("Enter the item name: ");
        scnr.nextLine();
        productName = scnr.nextLine();
        item2.setName(productName);
        System.out.print("Enter the item price: ");
        productPrice = scnr.nextInt();
        item2.setPrice(productPrice);
        System.out.print("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        item2.setQuantity(productQuantity);
    }
}