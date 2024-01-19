public class StockItem {
    private String description;
    private static int id;
    private float price;
    private int quantity;

    public String getDescription()
    {
        return this.description;
    }

    public int getID()
    {
        return id;
    }

    public float getPrice()
    {
        return this.price;
    }
    public void setPrice(float price)
    {
        if (price < 0)
            System.out.println(this.description + " price was attempted to be set to " + price + ". Ignoring...");
        else 
            this.price = price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }
    public void lowerQuantity()
    {
        this.quantity -= 1;
        if (this.quantity < 0)
        {
            System.out.println("Quantity already 0! Quantity can't be negative.");
            this.quantity = 0;
        }    
    }
    public void raiseQuantity(int value)
    {
        this.quantity += value;   
    }

    public StockItem() {
        this.description = "Default";
        id = id + 1;
        this.price = 0.0f;
        this.quantity = 0;
    }

    public StockItem(String description, float price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        id = id + 1;
    }

    public String toString()
    {
        String output = "";
        output += "Item number: " + id + " is " + this.description + " has price " + this.price + " we currently have " + this.quantity + " in stock.";
        return output;
    }
}
