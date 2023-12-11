import java.util.LinkedList;
import java.util.Queue;

public class ShoppingCart {
    private Queue<CartItem> items;
    private int itemCount;
    private float totalPrice;
    private int maxCount;

    public ShoppingCart() {
        this.items = new LinkedList<CartItem>();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
        this.maxCount = 10;
    }

    public ShoppingCart(int maxCount) {
        this.items = new LinkedList<CartItem>();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
        this.maxCount = maxCount;
    }

    public ShoppingCart(CartItem item) {
        this.items = new LinkedList<CartItem>();
        this.items.add(item);
        this.itemCount = 1;
        this.totalPrice = item.ItemPrice;
        this.maxCount = 10;
    }

    public ShoppingCart(int maxCount, CartItem item) {
        this.items = new LinkedList<CartItem>();
        this.items.add(item);
        this.itemCount = 1;
        this.totalPrice = item.ItemPrice;
        this.maxCount = maxCount;
    }

    public void addItem(CartItem item) {
        this.items.add(item);
        this.itemCount++;
        this.totalPrice += item.ItemPrice;
    }

    public void removeItem() {
        CartItem item = this.items.poll();
        this.itemCount--;
        this.totalPrice -= item.ItemPrice;
    }

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

    public void emptyCart() {
        this.items.clear();
        this.itemCount = 0;
        this.totalPrice = 0.0f;
    }

    public String toString() {
        String returnString = ("Item Count: " + this.itemCount + ", ");
        returnString += ("Total Price: " + this.totalPrice + "\n");
        returnString += ("Items:\n");
        for (CartItem item : this.items) {
            returnString += (item.toString() + "\n");
        }

        return returnString;
    }

    public CartItem[] toArray() {
        CartItem[] returnArray = new CartItem[this.itemCount];
        int i = 0;
        for (CartItem item : this.items) {
            returnArray[i] = item;
            i++;
        }
        return returnArray;
    }
}