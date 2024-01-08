import java.util.LinkedList;
import java.util.Queue;

public class ShoppingCart {
    private Queue<CartItem> items;
    private int itemCount;
    private float totalPrice;
    private int maxCount;

    // Constructor method that takes no arguments and sets up the object with defaults set
    public ShoppingCart() {
        this.items = new LinkedList<CartItem>();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
        this.maxCount = 10;
    }

    // Constructor method that takes in a max count
    public ShoppingCart(int maxCount) {
        this.items = new LinkedList<CartItem>();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
        this.maxCount = maxCount;
    }

    // Constructor method that takes in an item
    public ShoppingCart(CartItem item) {
        this.items = new LinkedList<CartItem>();
        this.items.add(item);
        this.itemCount = 1;
        this.totalPrice = item.ItemPrice;
        this.maxCount = 10;
    }

    // Constructor method that takes in a max count and an item
    public ShoppingCart(int maxCount, CartItem item) {
        this.items = new LinkedList<CartItem>();
        this.items.add(item);
        this.itemCount = 1;
        this.totalPrice = item.ItemPrice;
        this.maxCount = maxCount;
    }

    // Provides method that adds an item to the cart
    public void addItem(CartItem item) {
        this.items.add(item);
        this.itemCount++;
        this.totalPrice += item.ItemPrice;
    }

    // Provides method that removes the 
    public void removeItem() {
        CartItem item = this.items.poll();
        this.itemCount--;
        this.totalPrice -= item.ItemPrice;
    }

    // Provides method that removes the item with the given id
    public void removeItem(int itemId) {
        CartItem item = null;
        for (CartItem i : this.items) {
            if (i.ItemId == itemId) {
                item = i;
                break;
            }
        }
        if (item != null) {
            this.items.remove(item);
            this.itemCount--;
            this.totalPrice -= item.ItemPrice;
        }
    }

    // Provides method that removes the item with the given name
    public void emptyCart() {
        this.items.clear();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
    }

    // Provides method that ourputs the cart to a string
    public String toString() {
        String returnString = ("Item Count: " + this.itemCount + ", ");
        returnString += ("Total Price: " + this.totalPrice + "\n");
        returnString += ("Items:\n");
        for (CartItem item : this.items) {
            returnString += (item.toString() + "\n");
        }

        return returnString;
    }

    // Provides method that returns the cart as an array
    public CartItem[] toArray() {
        CartItem[] returnArray = new CartItem[this.itemCount];
        int i = 0;
        for (CartItem item : this.items) {
            returnArray[i] = item;
            i++;
        }
        return returnArray;
    }

    // Provides a method for the cart size to be increased
    public void increaseSize() {
        this.maxCount++;
    }

    // Provides a method for the cart size to be increased by a certain amount
    public void increaseSize(int amount) {
        this.maxCount += amount;
    }

    // Provides a method for the cart size to be decreased
    public void decreaseSize() {
        this.maxCount--;
    }

    // Provides a method for the cart size to be decreased by a certain amount
    public void decreaseSize(int amount) {
        this.maxCount -= amount;
    }
}