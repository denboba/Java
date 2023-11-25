package Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 2);
        Product product2 = new Product("Mouse", 50, 10);
        Product product3 = new Product("Keyboard", 100, 5);
        Store store = new Store("Altex", product1, product2, product3);
        System.out.println(store);
    }
}
