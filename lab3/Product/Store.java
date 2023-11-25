package Product;

public class Store {
    private String name;
    private Product product1;
    private Product product2;
    private Product product3;

    public Store(String name, Product product1, Product product2, Product product3){
        this.name = name;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }
    public double getTotalPrice(){
        return product1.getTotalPrice() + product2.getTotalPrice() + product3.getTotalPrice();
    }
    @Override
    public String toString(){
        return "Store{\n:  " +"Name  "+ name + "\n" + product1 + "\n" + product2 + "\n" + product3 + "\nTotal price: " + getTotalPrice()+ " \n}";
    }
}
