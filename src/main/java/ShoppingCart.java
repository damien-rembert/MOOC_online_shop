import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> content;



    // Internally, ShoppingCart stores products added there as Item-objects.
    // ShoppingCart must have an instance variable with either the Map<String, Item> type,
    // or the List<Item> type.
    // Don't add any other instance variable to the ShoppingCart class, besides the List or Map used to store the items.
    //
    //NB: If you save the items in a Map type variable,
    // you'll finds its values() method to be quite useful for going though all the items objects stored in it
    // for both this part of the exercise and the next.
    //
    //First let's give ShoppingCart a constructor with no parameters and these methods:

    public ShoppingCart() {
        this.content = new HashMap<>();
    }
    //
    //    public void add(String product, int price) adds an item to the cart that matches the product given as a parameter,
    //    with the price given as a parameter.
    public void add(String product, int price) {
        if (!this.content.containsKey(product)) {
            this.content.put(product, new Item(product, 1, price));
            return;
        }
        // int currentQty = this.content.get(product).qty;
        // this.content.put(product, new Item(product, currentQty + 1, price));
        this.content.get(product).increaseQuantity();
    }

    //    public int price() returns the total price of the shopping cart.
    public  int price() {
        int price = 0;
        for (Item item : this.content.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : this.content.values()) {
            System.out.println(item);
        }
        // buttermilk: 1
    }
}
