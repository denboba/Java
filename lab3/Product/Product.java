package Product;

public class Product
{
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString()
    {
        return "Product\n{\n" + "Name " + name + "  Price: " + price + " Quantity: " + quantity+ "\n }\n";
    }
    public double getTotalPrice()
    {
        return price * quantity;
    }

}
