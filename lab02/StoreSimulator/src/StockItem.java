public class StockItem {
    private String description;
    private int id;
    private float price;
    private int quantity;

    public StockItem() {
        this.description = "Default";
        this.id = 0;
        this.price = 0.0f;
        this.quantity = 0;
    }

    public StockItem(String description, float price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString()
    {
        String output = "";
        output += "Item number: " + this.id + " is " + this.description + " has price " + this.price + " we currently have " + this.quantity + " in stock.";
        return output;
    }
}
