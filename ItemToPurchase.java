/*
(1) Create two files to submit:

ItemToPurchase.java - Class definition
ShoppingCartPrinter.java - Contains main() method

Build the ItemToPurchase class with the following specifications:

Private fields
String itemName - initialized in default constructor to "none"
int itemPrice - intialized in default constructor to 0
int itemQuantity - intialized in default constructor to 0
Default constructor
Public member methods (mutators and accessors)
setName() & getName()
setPrice() & getPrice()
setQuantity() & getQuantity()

(2) In main(), prompt the user for two items and create two objects of the ItemToPurchase class.
Before prompting the second item, call scnr.nextLine(); to allow the user to input a new string.

Item 1
Enter the item name: Chocolate Chips
Enter the item price: 3
Enter the item quantity: 1

Item 2
Enter the item name: Bottled Water
Enter the item price: 1
Enter the item quantity: 10

(3) Add the costs of the two items together and output the total cost.

TOTAL COST
Chocolate Chips 1 @ $3 = $3
Bottled Water 10 @ $1 = $10

Total: $13
*/

public class ItemToPurchase {
    // Private fields for item name, price, and quantity
    private String itemName = "none";
    private int itemPrice = 0;
    private int itemQuantity = 0;

    // Initializing fields in default constructor
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    // Setter methods for item name, price, and quantity
    public void setName(String name) {
        itemName = name;
    }
    public void setPrice(int price) {
        itemPrice = price;
    }
    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    // Getter methods for item name, price, and quantity
    public String getName() {
        return itemName;
    }
    public int getPrice() {
        return itemPrice;
    }
    public int getQuantity() {
        return itemQuantity;
    }

    // Function to calculate the cost for each item
    public int itemTotal(int num1, int num2) {
        int itemTotal = itemPrice * itemQuantity;
        return itemTotal;
    }
}