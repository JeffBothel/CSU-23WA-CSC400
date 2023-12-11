public class CartItem {
    int ItemId;
    String ItemName;
    String ItemDescription;
    float ItemPrice;

    // Method that is used to contrstuct the object of this class
    private void BuildCartItem(int ItemId, String ItemName, String ItemDescription, float ItemPrice) {
        this.ItemId = ItemId;
        this.ItemName = ItemName;
        this.ItemDescription = ItemDescription;
        this.ItemPrice = ItemPrice;
    }

    // Constructor that builds the object of this class with no parameters set
    public CartItem() {
        BuildCartItem(0, "", "", 0.0f);
    }

    // Constructor that build the object of the class if the ItemId and ItemPrice are the only parameters set
    public CartItem(int ItemId, float ItemPrice) {
        BuildCartItem(ItemId, "", "", ItemPrice);
    }

    // Constructor that builds the object of this class if the ItemName and ItemPrice are the only parameters set
    public CartItem(String ItemName, float ItemPrice) {
        BuildCartItem(0, ItemName, "", ItemPrice);
    }

    // Constructor that builds the object of this class if the ItemId, ItemName, and ItemPrice are the only parameters set
    public CartItem(int ItemId, String ItemName, float ItemPrice) {
        BuildCartItem(ItemId, ItemName, "", ItemPrice);
    }
    
    // Constructor that builds the object of this class with all the parameters set
    public CartItem(int ItemId, String ItemName, String ItemDescription, float ItemPrice) {
        BuildCartItem(ItemId, ItemName, ItemDescription, ItemPrice);
    }

    // Method that returns the object as a string
    public String toString() {
        return "ItemId: " + ItemId + ", ItemName: " + ItemName + ", ItemDescription: " + ItemDescription + ", ItemPrice: " + ItemPrice;
    }
}