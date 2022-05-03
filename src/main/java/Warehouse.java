import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> stock;
    private Map<String, Integer> pricing;

    public Warehouse() {
        this.stock = new HashMap<>();
        this.pricing = new HashMap<>();
    }

    public void addProduct(String name, int price, int stock) {
        this.stock.put(name, stock);
        this.pricing.put(name, price);
    }

    public int price(String product) {
        if (this.pricing.containsKey(product)) {
            return this.pricing.get(product);
        }
        return -99;
    }

    //    reduces the stock remaining for the product it received as a parameter by one,
    //    and returns true if there was stock remaining.
    //    If the product was not available in the warehouse the method returns false.
    //    A products stock can't go below zero.
    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        else return 0;
    }

    public boolean take(String product) {
        boolean available = false;
        if (this.stock(product) > 0) {
            available = true;
            int currentStock = this.stock.get(product);
            this.stock.put(product, currentStock - 1);
        }

        return available;
    }

    public Set<String> products() {
        return this.stock.keySet();
    }






}
