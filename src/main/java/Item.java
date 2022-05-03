public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    // Items can be added to the shopping cart (which we'll add soon). An item is a product with a quantity.
    // You for example add an item representing one bread to the cart, or add an item representing 24 coffees.
    //
    //Create the class Item with the following methods:
    //
    //    public Item(String product, int qty, int unitPrice);
    //    a constructor that creates an item corresponding to the product given as a parameter.
    //    qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }


    //    public int price() return the price of the item.
    //    You get the items price by multiplying its unit price by its quantity(qty).
    public int price() {
        return (this.unitPrice * this.qty);
    }

    //    public void increaseQuantity increases the quantity by one.
    public void increaseQuantity() {
        this.qty++;
    }

    //    public String toString() returns the string representation of the item.
    //    which must match the format shown in the example below.
    //


    @Override
    public String toString() {
        return product + ": " + qty;
    }
}
