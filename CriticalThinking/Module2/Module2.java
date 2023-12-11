public class Module2 {
    public static void main(String[] args) {
        System.out.println("CSU Global - CSC-400: Data Structures & Algorithms - Module 2 Critical Thinking Assignment\n");

        // Create test items for the unit testing
        CartItem item1 = new CartItem(1, "Item 1", "Item 1 Description", 1.0f);
        CartItem item2 = new CartItem(2, "Item 2", "Item 2 Description", 2.0f);
        CartItem item3 = new CartItem(3, "Item 3", "Item 3 Description", 3.0f);
        CartItem item4 = new CartItem(4, "Item 4", "Item 4 Description", 4.0f);
        CartItem item5 = new CartItem(5, "Item 5", "Item 5 Description", 5.0f);
        CartItem item6 = new CartItem(6, "Item 6", "Item 6 Description", 6.0f);
        CartItem item7 = new CartItem(7, "Item 7", "Item 7 Description", 7.0f);
        CartItem item8 = new CartItem(8, "Item 8", "Item 8 Description", 8.0f);
        CartItem item9 = new CartItem(9, "Item 9", "Item 9 Description", 9.0f);
        CartItem item10 = new CartItem(10, "Item 10", "Item 10 Description", 10.0f);

        // Creates the cart that we are using for testing
        System.out.println("Creating a cart with 1 item");
        ShoppingCart cart = new ShoppingCart(item1);
        System.out.println(cart.toString());

        // Adding items to the ShoppingCart object
        System.out.println("Adding all the test items to the cart");
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);
        cart.addItem(item7);
        cart.addItem(item8);
        cart.addItem(item9);
        cart.addItem(item10);
        System.out.println(cart.toString());

        // Removing items from the ShoppingCart object
        System.out.println("Removing uneven items from the cart");
        cart.removeItem(1);
        cart.removeItem(3);
        cart.removeItem(5);
        cart.removeItem(7);
        cart.removeItem(9);
        System.out.println(cart.toString());

        // Sending itmes to an array from the cart
        System.out.println("Sending the cart to an array and printing the array");
        CartItem[] cartArray = cart.toArray();
        for (CartItem item : cartArray) {
            System.out.println(item.toString());
        }
    }
}
